package gg.corz;

public final class iiilIiIiIIIiIiIi {
   public static final int illllIiIIi = 35;
   public static final int iIlllIiIIi = 0;
   public static final int lllllIiIIi = 9;
   public static final int IilllIiIIi = 40;
   public static final int IllllIiIIi = 8;

   public static int iIlIlllllill(int hotbarIndex) {
      if (!liiiIIllIl(hotbarIndex)) {
         throw new IllegalArgumentException(IilliliilIIi<"IilliliilIIi","Glcd9P4t1YQUupe0VBDsfPOhNtRsaI6VtonOpmdhUjAtIU+RVQs5UhP+bnuu85w=">() + hotbarIndex);
      } else {
         return hotbarIndex;
      }
   }

   public static boolean liiiIIllIl(int invIndex) {
      return invIndex >= 0 && invIndex <= 8;
   }

   private iiilIiIiIIIiIiIi() {
   }

   public static int IliIlllilIi(int invIndex) {
      if (invIndex >= 0 && invIndex <= 35) {
         return invIndex < 9 ? 36 + invIndex : invIndex;
      } else {
         throw new IllegalArgumentException(
            IilliliilIIi<"IilliliilIIi","es15LD/CvGNa81oIvgEu+xqzgG9fTUS8NzeSd+Yti9vAJiUXkZXgCydCyxTXiJvJJyYnFts3SUMT8A==">() + invIndex
         );
      }
   }
}
