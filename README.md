K3D
---
###### Kotlin/Native OpenGL Graphics Library (OpenGL 4.1 ans GLFW Wrapper)


### Prerequisites  
###### Currently only tested on macOS 

#### Mac

K3D Uses the OpenGL3 Headers Provided by Apple  
Location: `/System/Library/Frameworks/OpenGL.framework/Headers` 

Install [GLFW](https://www.glfw.org/) Headers:  
`brew install glfw3` 

Install [CGLM](https://github.com/recp/cglm) Headers:  
`brew install cglm`  

### Build
Use Gradle to Build the K3D.klib  
`./gradlew build`

### Run Example
`./gradlew run`
