public static void dfs(Node root, List<Integer> result){
    if(root==null){
        return;
    }
    result.add(root.val);
    for(Node child:root.children){
        dfs(child,result);
    }
}

public static List<Integer> preorder(Node root) {
    List<Integer> list = new ArrayList<>();
    dfs(root,list);
    return list;
}