package org.coologic.cacaocat.domain.jarpackage.util;

import org.coologic.cacaocat.domain.jarpackage.entity.JarPackage;
import org.coologic.cacaocat.infrastruction.jarpackage.JarPackageProcessorImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JarPackageParserTest {
    @Test
    void testJarPackageParser() {
        JarPackageProcessorImpl jarPackageProcessor = new JarPackageProcessorImpl();
        JarPackage jarPackage = jarPackageProcessor.parseJarPackage("/src/test/resources/bytecode/jarcase001.jar");
        assertEquals(104, jarPackage.getClassFiles().size());
    }
}