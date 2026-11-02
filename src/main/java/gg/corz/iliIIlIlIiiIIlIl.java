package gg.corz;

public enum iliIIlIlIiiIIlIl {
   iiliIiilIl(1, 0),
   lIiiIiilIl(0, 1),
   iIiiIiilIl(-1, 1),
   IiliIiilIl(0, -1),
   lliiIiilIl(-1, -1),
   IIiiIiilIl(1, 1),
   IliiIiilIl(-1, 0),
   liliIiilIl(1, -1);
   private static final iliIIlIlIiiIIlIl[] iliiIiilIl = values();
   // $VF: synthetic field
   private static final iliIIlIlIiiIIlIl[] iiiiIiilIl = lIiiIiIlilli();
   public final int IiiiIiilIl;
   public final int liiiIiilIl;

   public boolean IliIlllilIi() {
      return this.IiiiIiilIl == 0 || this.liiiIiilIl == 0;
   }

   public iliIIlIlIiiIIlIl liiiIIllIl(int steps) {
      return iliiIiilIl[Math.floorMod(this.ordinal() + steps, iliiIiilIl.length)];
   }

   public static iliIIlIlIiiIIlIl iIlIlllllill(double yaw) {
      double var2 = (yaw % 360.0 + 360.0) % 360.0;
      if (var2 > 315.0 || var2 <= 45.0) {
         return lIiiIiilIl;
      } else if (var2 <= 135.0) {
         return IliiIiilIl;
      } else {
         return var2 <= 225.0 ? IiliIiilIl : iiliIiilIl;
      }
   }

   public static iliIIlIlIiiIIlIl IilliliilIIi(double yaw) {
      return iIlIlllllill(yaw + 180.0);
   }

   private iliIIlIlIiiIIlIl(int dz, int nullx) {
      this.IiiiIiilIl = dz;
      this.liiiIiilIl = nullx;
   }
}
