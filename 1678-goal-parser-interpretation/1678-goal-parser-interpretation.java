class Solution {
    public String interpret(String command) {
        command=command.replace("G","G").replace("()","o").replace("(al)","al");
        return command;
    }
}