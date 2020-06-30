package com.yz.bitedao.image.imageScan.util;

//项目的全局资源、变量
public class Project {
    //项目路径
    private static String path;

    static {
        path=Project.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        if(path.contains("file:")){
            path = path.substring(path.indexOf("file:")+5);
        }

        if (path.contains(".jar")) {
            path = path.substring(0, path.lastIndexOf(".jar"));
            path = path.substring(0, path.lastIndexOf("/"));
        }
    }

    public static String getProjectPath(){
        return path;
    }
}
