package gg.corz;

public final class IlIIiiillIIiii {
   private IiIililiIili lIliiliIIl;
   private int llliiliIIl;
   private IiIililiIili IIliiliIIl = IiIililiIili.ilIiiIlIlIiIiiIlIl;
   private int iIliiliIIl;
   private int IlliiliIIl;

   public void iIlIlllllill() {
      this.IIliiliIIl = IiIililiIili.ilIiiIlIlIiIiiIlIl;
      this.lIliiliIIl = IiIililiIili.ilIiiIlIlIiIiiIlIl;
      this.iIliiliIIl = 0;
      this.IlliiliIIl = 0;
      this.llliiliIIl = 0;
   }

   private static float IiIlliIliiIl(float v) {
      return Float.isNaN(v) ? 0.0F : v;
   }

   static float iliIiiliiiii(IlIIIlilllIIIlil style) {
      return switch (style) {
         case iliIiilIil -> 1.0F;
         case IiiIiilIil -> 0.6F;
         case liiIiilIil -> 0.4F;
      };
   }

   static int lIiiIiIlilli(IlIIIlilllIIIlil style) {
      return switch (style) {
         case iliIiilIil -> -1;
         case IiiIiilIil -> 0;
         case liiIiilIil -> 1;
      };
   }

   private IiIililiIili IlIlllIlilIl() {
      return this.lIliiliIIl == IiIililiIili.IlIiiIlIlllIiiIlIl && this.iIliiliIIl >= 4 ? IiIililiIili.IlIiiIlIlllIiiIlIl : IiIililiIili.ilIiiIlIlIiIiiIlIl;
   }

   static boolean IIIllIIliIIl(IlIIIlilllIIIlil totems, float ehp, int d, float style) {
      return totems == IlIIIlilllIIIlil.iliIiilIil ? ehp >= 20.0F && d >= 2 && style <= 0.6F : ehp >= 24.0F && d >= 3 && style <= 0.5F;
   }

   private IiIililiIili IilliliilIIi(illIiiilIilIiiil in, float ehp) {
      long var4 = -6356650693325147528L;
      var4 ^= ((long)(in.liiiIIllIl() <= 0 && in.Illlllllilll() >= 2 ? 1 : 0) << 32 ^ var4) & -1L << 32;
      this.IIliiliIIl = (int)(var4 >>> 32) != 0 ? IiIililiIili.IIliiIlIllIliiIlIl : IiIililiIili.IlIiiIlIlllIiiIlIl;
      this.lIliiliIIl = this.IIliiliIIl;
      this.iIliiliIIl = 0;
      this.IlliiliIIl = 0;
      this.llliiliIIl = 0;
      return this.IIliiliIIl;
   }

   public IiIililiIili IliIlllilIi(illIiiilIilIiiil in) {
      long var11 = 4974773287944276898L;
      long var13 = 89179412617381873L;
      if (in == null) {
         return this.IIliiliIIl;
      } else {
         IlIIIlilllIIIlil var2 = in.IIillIiliIil() == null ? IlIIIlilllIIIlil.iliIiilIil : in.IIillIiliIil();
         float var3 = IiIlliIliiIl(in.IliIlllilIi());
         if (var2 == IlIIIlilllIIIlil.iliIiilIil) {
            return this.IilliliilIIi(in, var3);
         } else {
            var11 ^= ((long)lIiiIiIlilli(var2) << 32 ^ var11) & -1L << 32;
            float var5 = IiIlliIliiIl(in.IilliliilIIi()) / Math.max(1.0F, var3);
            float var6 = IiIlliIliiIl(in.iliIiiliiiii()) / Math.max(1.0F, IiIlliIliiIl(in.IIIllIIliIIl()));
            var11 ^= (
                  (long)(
                        (in.liiiIIllIl() != 0 || !(var5 >= iliIiiliiiii(var2)) && !(var3 <= 8.0F))
                              && (in.Illlllllilll() < 2 || in.liiiIIllIl() > 1 + Math.max(0, (int)(var11 >>> 32)))
                           ? 0
                           : 1
                     )
                     ^ var11
               )
               & -1L >>> 32;
            var13 ^= (
                  (long)(
                           !in.lIiiIiIlilli()
                                 && !(var3 <= 8.0F + 2.0F * (float)((int)(var11 >>> 32)))
                                 && in.liiiIIllIl() > 1 + (int)(var11 >>> 32)
                                 && !(var5 >= 0.9F - 0.15F * (float)((int)(var11 >>> 32)))
                              ? 0
                              : 1
                        )
                        << 32
                     ^ var13
               )
               & -1L << 32;
            var13 ^= (
                  (long)(
                        !in.IlIlllIlilIl()
                              && !(var6 >= 0.9F)
                              && !in.IiIlliIliiIl()
                              && !(in.IIlllIlliIll() <= 0.15F)
                              && !IIIllIIliIIl(var2, var3, in.liiiIIllIl(), var5)
                           ? 0
                           : 1
                     )
                     ^ var13
               )
               & -1L >>> 32;
            IiIililiIili var10 = (int)var13 != 0 ? IiIililiIili.IlIiiIlIlllIiiIlIl : IiIililiIili.ilIiiIlIlIiIiiIlIl;
            if (var10 == this.lIliiliIIl) {
               this.iIliiliIIl++;
            } else {
               this.lIliiliIIl = var10;
               this.iIliiliIIl = 1;
            }

            if ((int)var11 != 0) {
               if (this.IIliiliIIl != IiIililiIili.IIliiIlIllIliiIlIl) {
                  this.IlliiliIIl = 0;
               }

               this.IIliiliIIl = IiIililiIili.IIliiIlIllIliiIlIl;
               this.IlliiliIIl++;
               this.llliiliIIl = 0;
               return this.IIliiliIIl;
            } else if (this.IIliiliIIl == IiIililiIili.IIliiIlIllIliiIlIl) {
               if (this.IlliiliIIl < 40) {
                  this.IlliiliIIl++;
                  return this.IIliiliIIl;
               } else {
                  this.IlliiliIIl = 0;
                  if ((int)(var13 >>> 32) != 0) {
                     this.IIliiliIIl = IiIililiIili.liIiiIlIliiIiiIlIl;
                     this.llliiliIIl = 0;
                     return this.IIliiliIIl;
                  } else {
                     this.IIliiliIIl = this.IlIlllIlilIl();
                     return this.IIliiliIIl;
                  }
               }
            } else if ((int)(var13 >>> 32) != 0) {
               this.IIliiliIIl = IiIililiIili.liIiiIlIliiIiiIlIl;
               this.llliiliIIl = 0;
               return this.IIliiliIIl;
            } else if (this.IIliiliIIl == IiIililiIili.liIiiIlIliiIiiIlIl) {
               this.llliiliIIl++;
               if (this.llliiliIIl < 10) {
                  return this.IIliiliIIl;
               } else {
                  this.llliiliIIl = 0;
                  this.IIliiliIIl = this.IlIlllIlilIl();
                  return this.IIliiliIIl;
               }
            } else {
               if (this.IIliiliIIl != this.lIliiliIIl && this.iIliiliIIl >= 4) {
                  this.IIliiliIIl = this.lIliiliIIl;
               }

               return this.IIliiliIIl;
            }
         }
      }
   }

   public IlIIiiillIIiii() {
      this.lIliiliIIl = IiIililiIili.ilIiiIlIlIiIiiIlIl;
   }

   public IiIililiIili liiiIIllIl() {
      return this.IIliiliIIl;
   }
}
