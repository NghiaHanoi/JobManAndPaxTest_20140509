import java.io.File;
import org.quartz.JobDataMap;
import org.wiperdog.jobmanager.JobExecutable;

public class InterruptJob implements JobExecutable {
	String status;
	boolean isInterrupt
	String classOfJob; 
	String sender;
	String jobName;
	
	public InterruptJob(String jobname, String classOfJob/*, String sender*/) {
		this.status = "init";
		this.jobName = jobname
		this.classOfJob = classOfJob;
		/*this.sender = sender;*/
		this.isInterrupt = false
	}
	public InterruptJob(String jobname, String classOfJob, String sender) {
		this.status = "init";
		this.jobName = jobname
		this.classOfJob = classOfJob;
		this.isInterrupt = false
	}
	
	public Object execute(JobDataMap params) throws InterruptedException {
		this.status = "running and will be interrupt"
		this.isInterrupt = true
		Date d = new Date(System.currentTimeMillis())
		println "*****" + d + " SLEEP "+this.jobName+" 8000 ms..."		
		Thread.currentThread().sleep(8000)		
		d = new Date(System.currentTimeMillis())
		println "*****" + d + " WAKEUP "+this.jobName+" AFTER SLEEP 8000 ms..."		
		this.status = "finish"		
		this.isInterrupt = false
		return null;
	}

	public String getName() {
		return this.jobName;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public boolean checkInterrupt() {
		return this.isInterrupt;
	}
	
	public String getArgumentString() {
		// TODO Auto-generated method stub
		return null;
	}

	public void stop(Thread thread) {
		println "********** InterruptJob.stop() "+this.jobName
		thread.interrupt()
	}
}