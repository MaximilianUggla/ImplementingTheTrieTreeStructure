package ImplementingTheTrieTreeStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    
    public static void main(String[] args) {
        TrieTree trie = new TrieTree();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        Integer N = 0;
        try {N = Integer.parseInt(r.readLine());
        } catch (Exception e) {e.printStackTrace();}

        try {
            for (int i = 0; i < N; i++) {
                    String line = r.readLine();
                    System.out.println(trie.startsWith(line));
                    trie.insert(line);
            }
        } catch (IOException e) {e.printStackTrace();}
    }
}
