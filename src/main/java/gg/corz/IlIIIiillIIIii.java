package gg.corz;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.awt.Color;
import net.minecraft.class_276;
import net.minecraft.class_310;

public class IlIIIiillIIIii {
   private long IllllllIIl;
   private float llIllllIIl;
   private float iIlllllIIl;
   private float iIIllllIIl;
   private boolean lIIllllIIl;
   private float IlIllllIIl;
   private final lllIlilillIlil lliIlllIIl;
   private Iiiiiiilliiiiiil iliIlllIIl;
   private static IlIIIiillIIIii iIiIlllIIl;
   private float iiIllllIIl;
   private float IiIllllIIl;
   private float liIllllIIl;
   private IilIiiIililIiiIi iiiIlllIIl;
   private float IIlllllIIl;
   private boolean IIIllllIIl;
   private float ilIllllIIl;
   private float lIlllllIIl;
   private liiIlIliiiiIlIli liiIlllIIl;
   private final class_310 IliIlllIIl = class_310.method_1551();
   private illlIllIillIll IiiIlllIIl;

   public boolean IlIillIiilIi(Color color) {
      long var18 = -7146032084051349825L;
      long var20 = 8863032114714835548L;
      if (this.lIIllllIIl && this.lliIlllIIl.IiIlliIliiIl()) {
         this.liiiIIllIl();

         try {
            class_276 var2 = this.IliIlllIIl.method_1522();
            if (var2 == null || var2.method_30277() == null) {
               var18 ^= (0L ^ var18) & -1L << 32;
               return (boolean)((int)(var18 >>> 32));
            }

            var18 ^= ((long)this.lliIlllIIl.IliIlllilIi() << 32 ^ var18) & -1L << 32;
            var18 ^= ((long)this.lliIlllIIl.liiiIIllIl() ^ var18) & -1L >>> 32;
            this.iiiIlllIIl
               .IliIlllilIi(
                  this.lliIlllIIl.IIIllIIliIIl(),
                  this.lliIlllIIl.iIlIlllllill(),
                  this.lliIlllIIl.IilliliilIIi(),
                  this.lliIlllIIl.lIiiIiIlilli(),
                  this.lliIlllIIl.iliIiiliiiii(),
                  (int)(var18 >>> 32),
                  (int)var18
               );
            float var5 = (float)(System.nanoTime() - this.IllllllIIl) / 1.0E9F;
            float var6 = (float)color.getRed() / 255.0F;
            float var7 = (float)color.getGreen() / 255.0F;
            float var8 = (float)color.getBlue() / 255.0F;
            float var9 = (float)color.getAlpha() / 255.0F;
            float var10 = 0.6F;
            float var11 = 0.0F;
            float var12 = 1.0F;
            GpuTextureView var13 = this.IiiIlllIIl
               .IliIlllilIi(
                  this.lliIlllIIl.IilliliilIIi(),
                  this.lliIlllIIl.IIIllIIliIIl(),
                  (int)(var18 >>> 32),
                  (int)var18,
                  var5,
                  this.iIIllllIIl,
                  var6,
                  var7,
                  var8,
                  var9,
                  this.IlIllllIIl,
                  this.llIllllIIl,
                  this.ilIllllIIl,
                  this.liIllllIIl,
                  this.IiIllllIIl,
                  this.iIlllllIIl,
                  var10,
                  var11,
                  var12,
                  this.iiIllllIIl
               );
            if (var13 != null) {
               var20 ^= ((long)(this.IIlllllIIl >= 2.15F ? 3 : (this.IIlllllIIl >= 1.05F ? 2 : 1)) << 32 ^ var20) & -1L << 32;
               GpuTextureView var15 = this.liiIlllIIl
                  .IliIlllilIi(
                     this.IiiIlllIIl.IIlllIlliIll(), var13, (int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32), Math.max(1.05F, this.IIlllllIIl * 1.22F)
                  );
               if (var15 == null) {
                  var15 = var13;
               }

               this.iliIlllIIl
                  .IliIlllilIi(
                     var2.method_71639(),
                     this.lliIlllIIl.IilliliilIIi(),
                     var15,
                     this.lliIlllIIl.IIIllIIliIIl(),
                     (int)(var18 >>> 32),
                     (int)var18,
                     var5,
                     this.iIIllllIIl,
                     var6,
                     var7,
                     var8,
                     var9,
                     this.IlIllllIIl,
                     this.llIllllIIl,
                     this.ilIllllIIl,
                     this.lIlllllIIl,
                     this.IIlllllIIl,
                     this.iIlllllIIl,
                     var10
                  );
               var20 ^= (1L ^ var20) & -1L >>> 32;
               return (boolean)((int)var20);
            }

            var20 ^= (0L ^ var20) & -1L << 32;
         } catch (Exception var24) {
            var24.printStackTrace();
            var18 ^= (0L ^ var18) & -1L << 32;
            return (boolean)((int)(var18 >>> 32));
         } finally {
            this.lliIlllIIl.Iilllilliill();
         }

         return (boolean)((int)(var20 >>> 32));
      } else {
         return false;
      }
   }

   public void lIiiIiIlilli(float v) {
      this.iIIllllIIl = v;
   }

   public static IlIIIiillIIIii IliIlllilIi() {
      if (iIiIlllIIl == null) {
         iIiIlllIIl = new IlIIIiillIIIii();
      }

      return iIiIlllIIl;
   }

   public void Iiilliiliiil() {
      if (this.lIIllllIIl) {
         this.liiiIIllIl();
         this.lliIlllIIl.IIlllIlliIll();
      }
   }

   public void IiIiliIiiiIi() {
      this.Illillliilli();
      this.IIIllllIIl = false;
   }

   public void IIlilIliiIli() {
      this.Illillliilli();
      this.lliIlllIIl.IIillIiliIil();
      this.IIIllllIIl = false;
   }

   public void IIillIiliIil(float v) {
      this.IIlllllIIl = v;
   }

   public void IIIilIIiiIIi() {
      if (this.lIIllllIIl) {
         this.liiiIIllIl();
         this.lliIlllIIl.Illlllllilll();
      }
   }

   private void liiiIIllIl() {
      if (!this.IIIllllIIl) {
         this.Illillliilli();
         this.iliIlllIIl = new Iiiiiiilliiiiiil();
         this.IiiIlllIIl = new illlIllIillIll();
         this.liiIlllIIl = new liiIlIliiiiIlIli();
         this.iiiIlllIIl = new IilIiiIililIiiIi();
         this.IllllllIIl = System.nanoTime();
         this.IIIllllIIl = true;
      }
   }

   public void IiIlliIliiIl(float v) {
      this.iiIllllIIl = v;
   }

   public void IIIllIIliIIl(float v) {
      this.llIllllIIl = v;
   }

   public void Ililllililil(float v) {
      this.iIlllllIIl = v;
   }

   public void IlIlllIlilIl(float v) {
      this.ilIllllIIl = v;
   }

   public void Iilllilliill(float v) {
      this.lIlllllIIl = v;
   }

   public boolean IilliliilIIi() {
      return this.lIIllllIIl;
   }

   public void Illlllllilll(float v) {
      this.IiIllllIIl = v;
   }

   public void iliIiiliiiii(float v) {
      this.IlIllllIIl = v;
   }

   private void Illillliilli() {
      if (this.iliIlllIIl != null) {
         this.iliIlllIIl.iliIiiliiiii();
         this.iliIlllIIl = null;
      }

      if (this.IiiIlllIIl != null) {
         this.IiiIlllIIl.Illlllllilll();
         this.IiiIlllIIl = null;
      }

      if (this.liiIlllIIl != null) {
         this.liiIlllIIl.IiIlliIliiIl();
         this.liiIlllIIl = null;
      }

      if (this.iiiIlllIIl != null) {
         this.iiiIlllIIl.iliIiiliiiii();
         this.iiiIlllIIl = null;
      }
   }

   public void IIlllIlliIll(float v) {
      this.liIllllIIl = v;
   }

   public IlIIIiillIIIii() {
      this.lliIlllIIl = new lllIlilillIlil();
      this.IIIllllIIl = false;
      this.lIIllllIIl = false;
      this.iIIllllIIl = 1.0F;
      this.IlIllllIIl = 0.35F;
      this.llIllllIIl = 1.0F;
      this.ilIllllIIl = 1.0F;
      this.IiIllllIIl = 1.55F;
      this.liIllllIIl = 1.35F;
      this.iiIllllIIl = 0.84F;
      this.IIlllllIIl = 1.45F;
      this.lIlllllIIl = 1.25F;
      this.iIlllllIIl = 0.55F;
      this.IllllllIIl = System.nanoTime();
   }

   public void iIlIlllllill(boolean enabled) {
      this.lIIllllIIl = enabled;
      if (enabled) {
         this.liiiIIllIl();
      } else {
         this.lliIlllIIl.Iilllilliill();
         if (this.IiiIlllIIl != null) {
            this.IiiIlllIIl.IilliliilIIi();
         }
      }
   }
}
