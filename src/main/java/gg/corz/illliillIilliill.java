package gg.corz;

import java.util.Arrays;

public final class illliillIilliill {
   public static final int Illlliiill = 2;
   public static final byte[] ilIiliiill = lIiiIiIlilli(illliillIilliill.lIIiliiill);
   public static final int lillliiill = 2;
   public static final int iillliiill = 3;
   public static final int illlliiill = 0;
   public static final int iiilliiill = 11;
   public static final int llilliiill = 8;
   public static final byte[] llIiliiill = lIiiIiIlilli(illliillIilliill.iIIiliiill);
   public static final int Iiilliiill = 10;
   public static final int Iillliiill = 1;
   public static final int lIllliiill = 0;
   public static final int ililliiill = 9;
   public static final byte iIIiliiill = IliIlllilIi(2, 0);
   public static final int Ililliiill = 7;
   public static final byte IlIiliiill = IliIlllilIi(3, 0);
   public static final int iIilliiill = 6;
   public static final int llllliiill = 3;
   public static final int iIllliiill = 1;
   public static final int lIilliiill = 5;
   public static final int IIIiliiill = 12;
   public static final int IIilliiill = 4;
   public static final byte lIIiliiill = IliIlllilIi(1, 0);

   public static boolean IilliliilIIi(int kind) {
      return (kind & 3) == 1;
   }

   public static byte IliIlllilIi(int tag, int base) {
      return (byte)(tag & 3 | base << 2);
   }

   private illliillIilliill() {
   }

   private static byte[] lIiiIiIlilli(byte kind) {
      byte[] var1 = new byte[4096];
      Arrays.fill(var1, kind);
      return var1;
   }

   public static int liiiIIllIl(int kind) {
      return kind & 3;
   }

   public static int iIlIlllllill(int kind) {
      return (kind & 0xFF) >>> 2;
   }
}
