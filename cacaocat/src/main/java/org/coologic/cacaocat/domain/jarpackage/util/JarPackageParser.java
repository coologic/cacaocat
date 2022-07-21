package org.coologic.cacaocat.domain.jarpackage.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.val;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.coologic.cacaocat.domain.classfile.util.ClassFileParser;
import org.coologic.cacaocat.domain.jarpackage.entity.JarPackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JarPackageParser {
    public static JarPackage parseJarPackage(JarFile jarFile) throws IOException {
        val jarPackage = new JarPackage();
        Enumeration<JarEntry> jarEntries = jarFile.entries();
        while (jarEntries.hasMoreElements()) {
            JarEntry jarEntry = jarEntries.nextElement();
            String jarEntryName = jarEntry.getName();
            if (jarEntryName.endsWith(".class") && jarEntryName.startsWith("BOOT-INF")) {
                System.out.println("begin:" + jarEntryName);
                InputStream inputStream = jarFile.getInputStream(jarEntry);
                ClassFile classFile = ClassFileParser.parseClassFile(new DataInputStream(inputStream));
                jarPackage.addClassFile(classFile);
            }
        }

        return jarPackage;
    }
}
