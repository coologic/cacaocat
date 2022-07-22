package org.coologic.cacaocat.presentation.classfile;

import lombok.AllArgsConstructor;
import org.coologic.cacaocat.application.classfile.ClassFileService;
import org.coologic.cacaocat.domain.classfile.entity.ClassFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classfile")
@AllArgsConstructor
public class ClassFileController {
    private ClassFileService classFileService;

    @GetMapping("one_classfile")
    public ClassFile getClassFile(String path) {
        return classFileService.parse(path);
    }
}
