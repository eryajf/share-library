package org.devops

// 此处的逻辑是为了解决那些流水线中调用没有的变量而不致使构建报错
// 用法：DefaultIfInexistent({COMMIT_USER}, "")
//      如果 COMMIT_USER 不存在，则返回空
static def DefaultIfInexistent(varNameExpr, defaultValue) {
    try {
        varNameExpr().replace("'","").replace('"','')
    } catch (exc) {
        defaultValue
    }
}

//格式化输出
def PrintMsg(value){
    println(value)
}
