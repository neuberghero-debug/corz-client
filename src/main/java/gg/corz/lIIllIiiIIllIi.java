package gg.corz;

public final class lIIllIiiIIllIi {
   final int IliIllIiilliIllIii;
   final int[] iIIlllIiiIlIlllIii;
   final ilIIililIiIIilil[] IiIlllIiiliIlllIii;
   final int[] liiIllIiiiiiIllIii;
   int iiIlllIiiIIllllIii = -1;
   final ilIIililIiIIilil[] llIlllIiiilIlllIii;
   public final String lIiIllIiiiIiIllIii;
   final int[] IIIlllIiilIIlllIii;
   final byte[] iliIllIiiIiiIllIii;

   public boolean liiiIIllIl() {
      return this.IiIlllIiiliIlllIii.length > 0;
   }

   private lIIllIiiIIllIi(String glowPages, int tint, byte[] name, int[] page, int[] pages, int[] glowPage, ilIIililIiIIilil[] mode, ilIIililIiIIilil[] seed) {
      this.lIiIllIiiiIiIllIii = glowPages;
      this.IliIllIiilliIllIii = tint;
      this.iliIllIiiIiiIllIii = name;
      this.liiIllIiiiiiIllIii = page;
      this.IIIlllIiilIIlllIii = pages;
      this.iIIlllIiiIlIlllIii = glowPage;
      this.llIlllIiiilIlllIii = mode;
      this.IiIlllIiiliIlllIii = seed;
   }

   @Override
   public String toString() {
      return this.lIiIllIiiiIiIllIii;
   }

   public boolean IilliliilIIi(int cls) {
      return this.iliIllIiiIiiIllIii[cls & (-(-135295125 >>> 5 | -135295125 << 27) * -1205604855 * 270549121 ^ -479765294)]
         == ((-128929426 + -109 >>> 27 | -128929426 + -109 << 5) ^ 169222205);
   }

   public int iIlIlllllill() {
      return this.iiIlllIiiIIllllIii;
   }

   public boolean IliIlllilIi() {
      if (this.IiIlllIiiliIlllIii.length > 0) {
         return false;
      } else {
         for (byte var4 : this.iliIllIiiIiiIllIii) {
            if (var4 != 0) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean lIiiIiIlilli(int cls) {
      return this.iIIlllIiiIlIlllIii[cls & (-727102403 - -49 - 111 ^ -727102720)] >= 0;
   }
}
