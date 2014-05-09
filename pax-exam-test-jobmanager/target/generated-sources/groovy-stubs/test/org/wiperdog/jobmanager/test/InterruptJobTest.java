package org.wiperdog.jobmanager.test;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@org.junit.runner.RunWith(value=org.ops4j.pax.exam.junit.PaxExam.class) @org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy(value=org.ops4j.pax.exam.spi.reactors.PerClass.class) public class InterruptJobTest
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
public static final java.lang.String PATH_TO_JOBEXECUTABLECLASS = "src/resource/JobExecutableImpl.groovy";
public static final java.lang.String PATH_TO_JOBINTERUPTCLASS = "src/resource/InterruptJob.groovy";
public InterruptJobTest
() {}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.lang.String getPath() { return (java.lang.String)null;}
public  void setPath(java.lang.String value) { }
public  java.lang.Object getJf() { return null;}
public  void setJf(java.lang.Object value) { }
public  java.lang.Class getJobExecutableCls() { return (java.lang.Class)null;}
public  void setJobExecutableCls(java.lang.Class value) { }
public  java.lang.Class getJobInteruptCls() { return (java.lang.Class)null;}
public  void setJobInteruptCls(java.lang.Class value) { }
@org.ops4j.pax.exam.Configuration() public  org.ops4j.pax.exam.Option[] config() { return (org.ops4j.pax.exam.Option[])null;}
@org.junit.Before() public  void setup()throws java.lang.Exception { }
@org.junit.After() public  void shutdown()throws java.lang.Exception { }
public  void interrupt_job_01()throws java.lang.Exception { }
public  void interrupt_job_02()throws java.lang.Exception { }
public  void interrupt_job_03()throws java.lang.Exception { }
@org.junit.Test() public  void interrupt_job_04()throws java.lang.Exception { }
}
