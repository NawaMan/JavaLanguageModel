package net.nawaman.javalanguagemodel.api;

import lombok.NonNull;

/** This object represents a package */
public class Package {
    
    public static final @NonNull Package javaLang = new Package(Object.class.getPackage().getName());
    
    
    public static final Package of(String name) {
        return new Package(name);
    }
    
    public static final Package of(java.lang.Package thePackage) {
        return new Package(thePackage.getName());
    }
    
    public static final Package of(Class<?> theClass) {
        return Package.of(theClass.getPackage());
    }
    
    public static boolean isValidPackageName(String packageName) {
        String pattern = "^[a-zA-Z_$][a-zA-Z\\d_$]*(\\.[a-zA-Z_$][a-zA-Z\\d_$]*)*$";
        return packageName.matches(pattern);
    }
    
    private final String  name;
    
    public Package(@NonNull String name) {
        if (!isValidPackageName(name)) {
            throw new IllegalArgumentException("Invalid package name: " + name);
        }
        
        this.name = name;
    }
    
    public String name() {
        return name;
    }
    
}
