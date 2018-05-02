# AARDemo
[[Android Studio] 导出或引用本地aar文件](https://www.cnblogs.com/0616--ataozhijia/p/4662744.html)

##引用本地aar方式1
```groovy
repositories {   
    flatDir {   
        dirs 'libs'    
    }   
}   
dependencies {   
    compile(name:'app-release', ext:'aar')  
}  
```
##引用本地aar方式2    
NEW->MODULE->import AAR Package     
  