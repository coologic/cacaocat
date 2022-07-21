package org.coologic.cacaocat.domain.jarpackage;

import org.coologic.cacaocat.domain.jarpackage.entity.JarPackage;

public interface JarPackageProcessor {
    JarPackage parseJarPackage(String path);
}
