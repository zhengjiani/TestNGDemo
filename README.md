#TestNG测试
心血来潮，决定用这个下午来探索一下。。。<br>
参考https://www.cnblogs.com/TankXiao/p/3888070.html<br>
最简单的那个例子要把方法改成静态的，详见`D:\code\java\TestNGDemo\src\test\java\examples\TestNGsimple.java`<br>
## TestNG的基本注解

    注解	        描述
    @BeforeSuite	注解的方法将只运行一次，运行所有测试前此套件中。
    @AfterSuite	注解的方法将只运行一次此套件中的所有测试都运行之后。
    @BeforeClass	注解的方法将只运行一次先行先试在当前类中的方法调用。
    @AfterClass	注解的方法将只运行一次后已经运行在当前类中的所有测试方法。
    @BeforeTest	注解的方法将被运行之前的任何测试方法属于内部类的 <test>标签的运行。
    @AfterTest	注解的方法将被运行后，所有的测试方法，属于内部类的<test>标签的运行。
    @BeforeGroups	组的列表，这种配置方法将之前运行。此方法是保证在运行属于任何这些组第一个测试方法，该方法被调用。
    @AfterGroups	组的名单，这种配置方法后，将运行。此方法是保证运行后不久，最后的测试方法，该方法属于任何这些组被调用。
    @BeforeMethod	注解的方法将每个测试方法之前运行。
    @AfterMethod	被注释的方法将被运行后，每个测试方法。
    @DataProvider	
    标志着一个方法，提供数据的一个测试方法。注解的方法必须返回一个Object[] []，其中每个对象[]的测试方法的参数列表中可以分配。
    该@Test 方法，希望从这个DataProvider的接收数据，需要使用一个dataProvider名称等于这个注解的名字。
    @Factory	作为一个工厂，返回TestNG的测试类的对象将被用于标记的方法。该方法必须返回Object[]。
    @Listeners	定义一个测试类的监听器。
    @Parameters	介绍如何将参数传递给@Test方法。
    @Test	标记一个类或方法作为测试的一部分。

控制测试用例按顺序执行，preserve-order="true"<br>

    <?xml version="1.0" encoding="UTF-8"?><!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
    <suite name="Suite1">
        <test name="test12" preserve-order="true">
            <classes>
                <class name="examples.TestNGsimple">
                    <methods>
                        <include name="TestNgsimple"/>
                        <include name="TestNgsimple1"/>
                        <include name="TestNgsimple2"/>
                    </methods>
                </class>
            </classes>
        </test>
    </suite>
使用maven命令执行testng<br>
``mvn -f pom.xml clean test -DxmlFileName=testting.xml``

![testng1.png](https://github.com/zhengjiani/markdownImages/blob/master/testng/testng1.PNG?raw=true)

