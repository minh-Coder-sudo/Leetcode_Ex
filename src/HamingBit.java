public int hammingDistance(int a, int b) {
       String binaryNumberA = Integer.toBinaryString(a);
        String binaryNumberB = Integer.toBinaryString(b);
        int count = 0;
        while(binaryNumberA.length()<binaryNumberB.length()){
            binaryNumberA = "0"+binaryNumberA;
        }

        while(binaryNumberB.length()<binaryNumberA.length()){
            binaryNumberB = "0"+binaryNumberB;
        }
        
        for(int i = 0;i<binaryNumberA.length();i++){
            if(binaryNumberA.charAt(i)!=binaryNumberB.charAt(i)){
                count++;
            }
        }
        return count;
    }