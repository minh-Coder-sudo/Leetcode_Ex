public static void dfs(Node root, List<Integer> result){
        if(root==null){
            return;
        }

        for(Node child:root.children){
            dfs(child,result);
        }
        result.add(root.val);
        
    }

    public static List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }