# 模板配置：
CodeFileName:

    P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})

CodeTemplate:

    package leetcode.editor.cn;
    //题目：${question.frontendQuestionId}:${question.title} :${question.titleSlug}
    //题目描述：${question.content}	
    public class P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug}){
        public static void main(String[] args) {
            P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug}) temp = new P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})();
            Solution solution = temp.new Solution();
            // TO TEST
        }
    ${question.code}
    }
