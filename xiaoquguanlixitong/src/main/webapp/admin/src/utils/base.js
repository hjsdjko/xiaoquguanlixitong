const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoquguanlixitong/",
            name: "xiaoquguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoquguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "小区管理系统"
        } 
    }
}
export default base
