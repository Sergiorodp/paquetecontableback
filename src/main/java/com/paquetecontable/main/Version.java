package com.paquetecontable.main;

public class Version {
    
    private final int major;
    private final int minor;
    private final int revision;

    public Version( final int major, final int minor, final int revision){
        this.major = major;
        this.minor = minor;
        this.revision = revision;
    }

    @Override
    public String toString(){
        return this.major + " " + this.minor + " " + this.revision;
    }
}
