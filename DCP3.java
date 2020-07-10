import java.util.*;
class Node
{
Character value;
Node left,right;
public Node(int value)
{
this.value=value;
left=right=null;
}
}
class Binarytree 
{ 
static void serialize(Node root,Character s[i])
{
      Node newi=new Node(s[i]);
    
    if(root.left==null)
    {
          root.left=newi;
     }
     else if(root.right==null)
     {
        root.right=newi;
      }
}
static void Deserialize(root)
{
  while(root)
{
   System.out.println(root.value);
   Deserialize(root.left);
   Deserialize(root.right);
}
}    
public static void main(String[] args) 
    { 
        int i;
        Node root=null;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        root=serialize(root,s[i]);
        for(i=1;i<s.lenth();i++)
         {
            root=serialize(root,s[i]);
          }
 
       
    }

}