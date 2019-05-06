cmake_minimum_required(VERSION 3.0)
project(model)

set(CMAKE_CXX_STANDARD 11)
include_directories(${CMAKE_SOURCE_DIR})


set(SOURCE_FILES
model_Model.h
model_Main.cpp
DBHandler.h
DBHandler.cpp
Servlet.h
Servlet.cpp
Login.h
Login.cpp
Admin.h
Admin.cpp
StandAdmin.h
StandAdmin.cpp
RegistrerStand.h
RegistrerStand.cpp
Stand.h
Stand.cpp
Result.h
Result.cpp
LoginUtil.h
LoginUtil.cpp
StandInfo.h
StandInfo.cpp
Vote.h
Vote.cpp
StandOverview.h
StandOverview.cpp
JavaEmail.h
JavaEmail.cpp)

add_executable(model ${SOURCE_FILES})