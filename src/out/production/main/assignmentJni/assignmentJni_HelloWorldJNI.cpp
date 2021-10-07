#include "assignmentJni_HelloWorldJNI.h"
#include <iostream>
JNIEXPORT void JNICALL Java_assignmentJni_HelloWorldJNI_sayHello
  (JNIEnv* env, jobject thisObject) {
    std::cout << "Hello from C++ !!" << std::endl;
}
