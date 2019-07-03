package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileListSearcherTest {
    FileListSearcher ob;

    @Before
    public void setUp() throws Exception {
    ob=new FileListSearcher();
    }


    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void fileSearchforTextFiles() throws IOException {
        String res=ob.fileSearch("/home/abinash/IdeaProjects/PE2/",".txt");
        assertEquals(".git\n" +
                ".idea\n" +
                "out\n" +
                "Java Assignment1.iml\n" +
                "file.txt\n" +
                "Hii this is Abinash Kumar Jena working as a full stack developer In IBM India Private Limited.\n" +
                "\n" +
                "src\n",res);
    }
   @Test
    public void fileSearchforimlFiles() throws IOException {
        String res=ob.fileSearch("/home/abinash/IdeaProjects/PE2/",".iml");
        assertEquals(".git\n" +
                ".idea\n" +
                "out\n" +
                "Java Assignment1.iml\n" +
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<module type=\"JAVA_MODULE\" version=\"4\">\n" +
                "  <component name=\"NewModuleRootManager\" inherit-compiler-output=\"true\">\n" +
                "    <exclude-output />\n" +
                "    <content url=\"file://$MODULE_DIR$\">\n" +
                "      <sourceFolder url=\"file://$MODULE_DIR$/src/java\" isTestSource=\"false\" />\n" +
                "      <sourceFolder url=\"file://$MODULE_DIR$/src/test\" isTestSource=\"true\" />\n" +
                "    </content>\n" +
                "    <orderEntry type=\"inheritedJdk\" />\n" +
                "    <orderEntry type=\"sourceFolder\" forTests=\"false\" />\n" +
                "    <orderEntry type=\"library\" name=\"KotlinJavaRuntime\" level=\"project\" />\n" +
                "    <orderEntry type=\"module-library\">\n" +
                "      <library name=\"JUnit4\">\n" +
                "        <CLASSES>\n" +
                "          <root url=\"jar://$MAVEN_REPOSITORY$/junit/junit/4.12/junit-4.12.jar!/\" />\n" +
                "          <root url=\"jar://$MAVEN_REPOSITORY$/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar!/\" />\n" +
                "        </CLASSES>\n" +
                "        <JAVADOC />\n" +
                "        <SOURCES />\n" +
                "      </library>\n" +
                "    </orderEntry>\n" +
                "  </component>\n" +
                "</module>\n" +
                "file.txt\n" +
                "src\n",res);
    }
    @Test
    public void fileSearchforimlFilesNull() throws IOException {
        String res=ob.fileSearch(null,null);
        assertNull(res);
    }
}