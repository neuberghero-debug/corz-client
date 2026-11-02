package gg.corz;

public final class lillililiillilil {
   public int iiIlilIlil;
   public static final int IiIlilIlil = 6;
   public int liIlilIlil;
   public int IlllilIlil;
   public int IIllilIlil;
   public int iIllilIlil;
   public int lIllilIlil;

   private static int lIiiIiIlilli(int a, int b) {
      return (int)Math.min(1000000L, (long)iliIiiliiiii(a) + (long)iliIiiliiiii(b));
   }

   private static int IilliliilIIi(int[] i, int a) {
      return a < i.length ? iliIiiliiiii(i[a]) : 0;
   }

   public static lillililiillilil liiiIIllIl(int[] a) {
      lillililiillilil var1 = new lillililiillilil();
      if (a == null) {
         return var1;
      } else {
         var1.liIlilIlil = IilliliilIIi(a, 0);
         var1.iiIlilIlil = IilliliilIIi(a, 1);
         var1.IIllilIlil = IilliliilIIi(a, 2);
         var1.lIllilIlil = IilliliilIIi(a, 3);
         var1.iIllilIlil = IilliliilIIi(a, 4);
         var1.IlllilIlil = IilliliilIIi(a, 5);
         return var1;
      }
   }

   static int iliIiiliiiii(int v) {
      return Math.max(0, Math.min(1000000, v));
   }

   void iIlIlllllill(lillililiillilil o) {
      if (o != null) {
         this.liIlilIlil = lIiiIiIlilli(this.liIlilIlil, o.liIlilIlil);
         this.iiIlilIlil = lIiiIiIlilli(this.iiIlilIlil, o.iiIlilIlil);
         this.IIllilIlil = lIiiIiIlilli(this.IIllilIlil, o.IIllilIlil);
         this.lIllilIlil = lIiiIiIlilli(this.lIllilIlil, o.lIllilIlil);
         this.iIllilIlil = lIiiIiIlilli(this.iIllilIlil, o.iIllilIlil);
         this.IlllilIlil = lIiiIiIlilli(this.IlllilIlil, o.IlllilIlil);
      }
   }

   public int[] IliIlllilIi() {
      return new int[]{
         iliIiiliiiii(this.liIlilIlil),
         iliIiiliiiii(this.iiIlilIlil),
         iliIiiliiiii(this.IIllilIlil),
         iliIiiliiiii(this.lIllilIlil),
         iliIiiliiiii(this.iIllilIlil),
         iliIiiliiiii(this.IlllilIlil)
      };
   }
}
