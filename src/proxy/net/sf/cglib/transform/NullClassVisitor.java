package net.sf.cglib.transform;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.CodeVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;

public class NullClassVisitor implements ClassVisitor {
    public static final NullClassVisitor INSTANCE = new NullClassVisitor();
    
    public void visit(int access, String name, String superName, String[] interfaces, String sourceFile) { }
    public void visitEnd() { }
    public void visitField(int access, String name, String desc, Object value, Attribute attrs) { }
    public void visitInnerClass(String name, String outerName, String innerName, int access) { }
    public void visitAttribute(Attribute attrs) { }

    public CodeVisitor visitMethod(int access, String name, String desc, String[] exceptions, Attribute attrs) {
        return NullCodeVisitor.INSTANCE;
    }

    private static class NullCodeVisitor implements CodeVisitor {
        public static final NullCodeVisitor INSTANCE = new NullCodeVisitor();
        
        public void visitFieldInsn(int opcode, String owner, String name, String desc) { }
        public void visitIincInsn(int var, int increment) { }
        public void visitInsn(int opcode) { }
        public void visitIntInsn(int opcode, int operand) { }
        public void visitJumpInsn(int opcode, Label label) { }
        public void visitLabel(Label label) { }
        public void visitLdcInsn(Object cst) { }
        public void visitLineNumber(int line, Label start) { }
        public void visitLocalVariable(String name, String desc, Label start, Label end, int index) { }
        public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) { }
        public void visitMaxs(int maxStack, int maxLocals) { }
        public void visitMethodInsn(int opcode, String owner, String name, String desc) { }
        public void visitMultiANewArrayInsn(String desc, int dims) { }
        public void visitTableSwitchInsn(int min, int max, Label dflt, Label[] labels) { }
        public void visitTryCatchBlock(Label start, Label end, Label handler, String type) { }
        public void visitTypeInsn(int opcode, String desc) { }
        public void visitVarInsn(int opcode, int var) { }
        public void visitAttribute(Attribute attrs) { }
    }
}