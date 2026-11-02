package gg.corz;

import java.util.Arrays;

public record lliiliiliili(int[] pearlLaunched, int[] pearlLow, int[] pearlDir, double holeTime, double retotem, double boom, int[] jumpReset) {
   private final double iliIlllIlIiiIlllIl;
   private final int[] liiIlllIliiiIlllIl;
   private final double lIiIlllIliIiIlllIl;
   private final int[] iilIlllIlIIiIlllIl;
   private final int[] IilIlllIllilIlllIl;
   private final int[] lllIlllIlillIlllIl;
   private final double IliIlllIllliIlllIl;

   public double iliIiiliiiii() {
      return this.iliIlllIlIiiIlllIl;
   }

   public lliiliiliili(int[] pearlLaunched, int[] pearlLow, int[] pearlDir, double holeTime, double retotem, double boom, int[] jumpReset) {
      this.lllIlllIlillIlllIl = pearlLaunched;
      this.IilIlllIllilIlllIl = pearlLow;
      this.iilIlllIlIIiIlllIl = pearlDir;
      this.lIiIlllIliIiIlllIl = holeTime;
      this.IliIlllIllliIlllIl = retotem;
      this.iliIlllIlIiiIlllIl = boom;
      this.liiIlllIliiiIlllIl = jumpReset;
   }

   public int[] IIIllIIliIIl() {
      return this.liiIlllIliiiIlllIl;
   }

   @Override
   public int hashCode() {
      long var2 = 2560836792227324418L;
      var2 ^= ((long)Arrays.hashCode(this.lllIlllIlillIlllIl) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Arrays.hashCode(this.IilIlllIllilIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Arrays.hashCode(this.iilIlllIlIIiIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.lIiIlllIliIiIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.IliIlllIllliIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.iliIlllIlIiiIlllIl)) << 32 ^ var2) & -1L << 32;
      return 31 * (int)(var2 >>> 32) + Arrays.hashCode(this.liiIlllIliiiIlllIl);
   }

   public double IilliliilIIi() {
      return this.lIiIlllIliIiIlllIl;
   }

   @Override
   public String toString() {
      return IlIlllIlilIl<"IlIlllIlilIl","Y2zMHA0VnREW4VA1U7N0pOu017PQoPYKmWfuhJb0syWR9PhuKC7eMQalYNSRnyKP">()
         + Arrays.toString(this.lllIlllIlillIlllIl)
         + IlIlllIlilIl<"IlIlllIlilIl","wgNjJokqnJAgCrYcoTPz7mTzWH4bAaqrhsmUdn/ezuKTzfuRpv9D">()
         + Arrays.toString(this.IilIlllIllilIlllIl)
         + IlIlllIlilIl<"IlIlllIlilIl","aZFrOyxa771ESlV9YEQSyXMBh1cihSc2EBzttYWJHj19GJojNY74">()
         + Arrays.toString(this.iilIlllIlIIiIlllIl)
         + IlIlllIlilIl<"IlIlllIlilIl","LgTtIrp/hRCnL6oux6UO06yyvRJ30q7rgmqvUnOQi+YoS4XG7gql">()
         + this.lIiIlllIliIiIlllIl
         + IlIlllIlilIl<"IlIlllIlilIl","nILnwjK+ynaWIB9LR5eHWK00oFjEjg2GM5oo0Chs87sIjVZM0LM=">()
         + this.IliIlllIllliIlllIl
         + IlIlllIlilIl<"IlIlllIlilIl","B1ejSDWtngDSFqlRTlKAOfWqaXVcjxQlgqzJ4HYotZ4sdOw=">()
         + this.iliIlllIlIiiIlllIl
         + IlIlllIlilIl<"IlIlllIlilIl","KRqb8PFn9rg3P7kWGwjvtRTfbr4OLT8niNw+o1yb0SmLwGGSRlyKEw==">()
         + Arrays.toString(this.liiIlllIliiiIlllIl)
         + IlIlllIlilIl<"IlIlllIlilIl","7EdVjxpyo67q1qIAOncHUGbYAk/m2wZXXRx3Jik=">();
   }

   public int[] IliIlllilIi() {
      return this.lllIlllIlillIlllIl;
   }

   public int[] iIlIlllllill() {
      return this.iilIlllIlIIiIlllIl;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else {
         return !(o instanceof lliiliiliili var2)
            ? false
            : Arrays.equals(this.lllIlllIlillIlllIl, var2.lllIlllIlillIlllIl)
               && Arrays.equals(this.IilIlllIllilIlllIl, var2.IilIlllIllilIlllIl)
               && Arrays.equals(this.iilIlllIlIIiIlllIl, var2.iilIlllIlIIiIlllIl)
               && Double.compare(this.lIiIlllIliIiIlllIl, var2.lIiIlllIliIiIlllIl) == 0
               && Double.compare(this.IliIlllIllliIlllIl, var2.IliIlllIllliIlllIl) == 0
               && Double.compare(this.iliIlllIlIiiIlllIl, var2.iliIlllIlIiiIlllIl) == 0
               && Arrays.equals(this.liiIlllIliiiIlllIl, var2.liiIlllIliiiIlllIl);
      }
   }

   public double lIiiIiIlilli() {
      return this.IliIlllIllliIlllIl;
   }

   public int[] liiiIIllIl() {
      return this.IilIlllIllilIlllIl;
   }
}
