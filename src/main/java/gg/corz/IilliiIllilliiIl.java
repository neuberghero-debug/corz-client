package gg.corz;

import com.mojang.blaze3d.textures.GpuTextureView;
import net.minecraft.class_276;
import net.minecraft.class_310;

public class IilliiIllilliiIl {
   private float IilillIlll;
   private liiIlIliiiiIlIli iiilllIlll;
   private Iiiiiiilliiiiiil ililllIlll;
   private final lllIlilillIlil llilllIlll;
   private float IllillIlll;
   private float iIIIilIlll;
   private float IiiillIlll;
   private float liIillIlll;
   private float illillIlll;
   private float IiIillIlll;
   private final class_310 IlilllIlll = class_310.method_1551();
   private float iiIillIlll;
   private float iIlillIlll;
   private float llIillIlll;
   private float iilillIlll;
   private float lilillIlll;
   private float IliillIlll;
   private float iIiillIlll;
   private float lIIIilIlll;
   private boolean lIIillIlll;
   private float IIIIilIlll;
   private iliIIiIiIiiIIiIi IiilllIlll;
   private int liiillIlll;
   private float lIiillIlll;
   private static IilliiIllilliiIl iIilllIlll;
   private boolean iIIillIlll;
   private float iliillIlll;
   private float iiiillIlll;
   private illlIllIillIll liilllIlll;
   private float lIlillIlll;
   private boolean IlIillIlll;
   private float ilIillIlll;
   private float IIlillIlll;
   private float lllillIlll;
   private long IlIIilIlll;
   private boolean lliillIlll;
   private IilIiiIililIiiIi IIIillIlll;
   private float IIiillIlll;

   public IilliiIllilliiIl() {
      this.llilllIlll = new lllIlilillIlil();
      this.lIIillIlll = false;
      this.iIIillIlll = false;
      this.IlIillIlll = true;
      this.llIillIlll = 1.0F;
      this.ilIillIlll = 8.0F;
      this.IiIillIlll = 1.0F;
      this.liIillIlll = 1.0F;
      this.iiIillIlll = 1.55F;
      this.IIlillIlll = 1.35F;
      this.lIlillIlll = 0.84F;
      this.iIlillIlll = 1.45F;
      this.IllillIlll = 1.25F;
      this.lllillIlll = 0.68F;
      this.illillIlll = 0.55F;
      this.IilillIlll = 0.6F;
      this.lilillIlll = 0.2F;
      this.iilillIlll = 1.0F;
      this.IIiillIlll = 1.0F;
      this.lIiillIlll = 0.0F;
      this.iIiillIlll = 0.0F;
      this.IliillIlll = 1.0F;
      this.lliillIlll = false;
      this.iliillIlll = 1.5F;
      this.IiiillIlll = 1.0F;
      this.liiillIlll = 0;
      this.iiiillIlll = 1.0F;
      this.IIIIilIlll = 1.0F;
      this.lIIIilIlll = 1.0F;
      this.iIIIilIlll = 1.0F;
      this.IlIIilIlll = System.nanoTime();
   }

   public void IIlllIlliIll(float v) {
      this.iIlillIlll = v;
   }

   public void llIIlilIIl() {
      this.IiIIlliIIl();
      this.llilllIlll.IIillIiliIil();
      this.lIIillIlll = false;
   }

   public void Iiilliiliiil(float v) {
      this.lIlillIlll = v;
   }

   public void iliIiiliiiii(float v) {
      this.llIillIlll = v;
   }

   public void Iiiiliiiiiii() {
      if (this.iIIillIlll) {
         this.liiiIIllIl();
         this.llilllIlll.IIlllIlliIll();
      }
   }

   public void Iilllilliill(float v) {
      this.liIillIlll = v;
   }

   public void IIIllIIliIIl(float v) {
      this.ilIillIlll = v;
   }

   public void Iilililiiili(float v) {
      this.IiiillIlll = v;
   }

   public void IiIiliIiiiIi(float b, float r, float g, float a) {
      this.IilillIlll = b;
      this.lilillIlll = r;
      this.iilillIlll = g;
      this.IIiillIlll = a;
   }

   public void Ililllililil(float v) {
      this.IllillIlll = v;
   }

   public void IIIilIIiiIIi(float v) {
      this.lllillIlll = v;
   }

   public static IilliiIllilliiIl IliIlllilIi() {
      if (iIilllIlll == null) {
         iIilllIlll = new IilliiIllilliiIl();
      }

      return iIilllIlll;
   }

   public void IIIIllIIIl() {
      if (this.iIIillIlll) {
         this.liiiIIllIl();
         this.llilllIlll.Illlllllilll();
      }
   }

   public void IiIlliIliiIl(float v) {
      this.iiIillIlll = v;
   }

   public void IlIlllIlilIl(float v) {
      this.iiIillIlll = v;
      this.iIlillIlll = v;
   }

   public void Illlllllilll(float v) {
      this.IiIillIlll = v;
   }

   public boolean iIIIlIlIIl() {
      long var12 = -3932036415303417584L;
      long var14 = 4449319338706511408L;
      if (this.iIIillIlll && this.llilllIlll.IiIlliIliiIl()) {
         this.liiiIIllIl();

         try {
            class_276 var1 = this.IlilllIlll.method_1522();
            if (var1 == null || var1.method_30277() == null) {
               var12 ^= (0L ^ var12) & -1L << 32;
               return (boolean)((int)(var12 >>> 32));
            }

            var12 ^= ((long)this.llilllIlll.IliIlllilIi() << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)this.llilllIlll.liiiIIllIl() ^ var12) & -1L >>> 32;
            this.IIIillIlll
               .IliIlllilIi(
                  this.llilllIlll.IIIllIIliIIl(),
                  this.llilllIlll.iIlIlllllill(),
                  this.llilllIlll.IilliliilIIi(),
                  this.llilllIlll.lIiiIiIlilli(),
                  this.llilllIlll.iliIiiliiiii(),
                  (int)(var12 >>> 32),
                  (int)var12
               );
            float var4 = (float)(System.nanoTime() - this.IlIIilIlll) / 1.0E9F;
            if (this.IlIillIlll) {
               float var5 = 0.0F;
               if (this.IlilllIlll.field_1724 != null && this.IlilllIlll.field_1724.field_6252) {
                  var5 = 1.0F - Math.min(1.0F, this.IlilllIlll.field_1724.field_6251);
               }

               float var6 = Math.max(this.lIiillIlll, var5);
               float var7 = this.iIiillIlll;
               this.lIiillIlll = this.lIiillIlll * this.lllillIlll;
               this.iIiillIlll = this.iIiillIlll * this.lIlillIlll;
               if (this.lIiillIlll < 0.01F) {
                  this.lIiillIlll = 0.0F;
               }

               if (this.iIiillIlll < 0.01F) {
                  this.iIiillIlll = 0.0F;
               }

               GpuTextureView var8 = this.liilllIlll
                  .IliIlllilIi(
                     this.llilllIlll.IilliliilIIi(),
                     this.llilllIlll.IIIllIIliIIl(),
                     (int)(var12 >>> 32),
                     (int)var12,
                     var4,
                     this.llIillIlll,
                     this.IilillIlll,
                     this.lilillIlll,
                     this.iilillIlll,
                     this.IIiillIlll,
                     this.ilIillIlll,
                     this.IiIillIlll,
                     this.liIillIlll,
                     this.IIlillIlll,
                     this.iiIillIlll,
                     this.illillIlll,
                     var6,
                     var7,
                     this.IliillIlll,
                     this.lIlillIlll
                  );
               if (var8 != null) {
                  var14 ^= ((long)(this.iIlillIlll >= 2.15F ? 3 : (this.iIlillIlll >= 1.05F ? 2 : 1)) << 32 ^ var14) & -1L << 32;
                  GpuTextureView var10 = this.iiilllIlll
                     .IliIlllilIi(
                        this.liilllIlll.IIlllIlliIll(), var8, (int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32), Math.max(1.05F, this.iIlillIlll * 1.22F)
                     );
                  if (var10 == null) {
                     var10 = var8;
                  }

                  this.ililllIlll
                     .IliIlllilIi(
                        var1.method_71639(),
                        this.llilllIlll.IilliliilIIi(),
                        var10,
                        this.llilllIlll.IIIllIIliIIl(),
                        (int)(var12 >>> 32),
                        (int)var12,
                        var4,
                        this.llIillIlll,
                        this.IilillIlll,
                        this.lilillIlll,
                        this.iilillIlll,
                        this.IIiillIlll,
                        this.ilIillIlll,
                        this.IiIillIlll,
                        this.liIillIlll,
                        this.IllillIlll,
                        this.iIlillIlll,
                        this.illillIlll,
                        var6
                     );
               }
            }

            if (this.lliillIlll) {
               this.IiilllIlll
                  .IliIlllilIi(
                     var1.method_71639(),
                     this.llilllIlll.IilliliilIIi(),
                     this.llilllIlll.IIIllIIliIIl(),
                     (int)(var12 >>> 32),
                     (int)var12,
                     var4,
                     this.iliillIlll,
                     this.IiiillIlll,
                     this.liiillIlll,
                     this.iiiillIlll,
                     this.IIIIilIlll,
                     this.lIIIilIlll,
                     this.iIIIilIlll
                  );
            }

            var14 ^= (1L ^ var14) & -1L >>> 32;
         } finally {
            this.llilllIlll.Iilllilliill();
         }

         return (boolean)((int)var14);
      } else {
         return false;
      }
   }

   private void IiIIlliIIl() {
      if (this.ililllIlll != null) {
         this.ililllIlll.iliIiiliiiii();
         this.ililllIlll = null;
      }

      if (this.IiilllIlll != null) {
         this.IiilllIlll.iliIiiliiiii();
         this.IiilllIlll = null;
      }

      if (this.liilllIlll != null) {
         this.liilllIlll.Illlllllilll();
         this.liilllIlll = null;
      }

      if (this.iiilllIlll != null) {
         this.iiilllIlll.IiIlliIliiIl();
         this.iiilllIlll = null;
      }

      if (this.IIIillIlll != null) {
         this.IIIillIlll.iliIiiliiiii();
         this.IIIillIlll = null;
      }
   }

   public void IIiilIiiiIii(int v) {
      this.liiillIlll = v;
   }

   public void IIillIiliIil(float v) {
      this.IIlillIlll = v;
   }

   public void iIlIlllllill(boolean enabled) {
      this.iIIillIlll = enabled;
      if (enabled) {
         this.liiiIIllIl();
      } else {
         this.lIiillIlll = 0.0F;
         this.iIiillIlll = 0.0F;
         this.llilllIlll.Iilllilliill();
         if (this.liilllIlll != null) {
            this.liilllIlll.IilliliilIIi();
         }
      }
   }

   public void Illillliilli(float v) {
      this.iliillIlll = v;
   }

   public boolean IilliliilIIi() {
      return this.iIIillIlll;
   }

   public void IlIillIiilIi(float v) {
      this.illillIlll = v;
   }

   private void liiiIIllIl() {
      if (!this.lIIillIlll) {
         this.IiIIlliIIl();
         this.ililllIlll = new Iiiiiiilliiiiiil();
         this.IiilllIlll = new iliIIiIiIiiIIiIi();
         this.liilllIlll = new illlIllIillIll();
         this.iiilllIlll = new liiIlIliiiiIlIli();
         this.IIIillIlll = new IilIiiIililIiiIi();
         this.IlIIilIlll = System.nanoTime();
         this.lIIillIlll = true;
      }
   }

   public void IIlilIliiIli(boolean v) {
      this.lliillIlll = v;
   }

   public void lIiiIiIlilli(boolean v) {
      this.IlIillIlll = v;
   }

   public void Iliilliiilii(float b, float a, float r, float g) {
      this.iiiillIlll = b;
      this.IIIIilIlll = a;
      this.lIIIilIlll = r;
      this.iIIIilIlll = g;
   }
}
