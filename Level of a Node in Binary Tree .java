class GfG
{
    public static int getLevel(Node root, int key)
    {
        // add your code here
        if(root==null) return 0;
        if(key==root.data) return 1;
        int l=getLevel(root.left,key);
        int r=getLevel(root.right,key);
        if(l==0 && r==0) return 0;
        if(l==0) return r+1;
        if(r==0) return l+1;
        return 0;
        
    }
}
