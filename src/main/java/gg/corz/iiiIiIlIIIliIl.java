package gg.corz;

import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;

public final class iiiIiIlIIIliIl {
   private static final int lliilIilliliilIill = 1;
   private final int iIlIiIillIllIiIill;
   private float iliIiIillIiiIiIill;
   private static final int lIIIiIilliIIIiIill = 2;
   private final float IlIIiIillllIIiIill;
   private static final Matrix4f IIiilIilllIiilIill = new Matrix4f();
   private final float ilIIiIillIiIIiIill;
   private static final int iIiilIillIliilIill = 0;
   private final List<IIliilillIliilil> IliIiIilllliIiIill = new ArrayList<>();
   private static final int iiiilIillIIIIiIill = 1;
   private final int IIlIiIilllIlIiIill;
   private final float IilIiIilllilIiIill;
   private static final int IiiilIillliiilIill = 2;
   private final float liIIiIilliiIIiIill;
   private final boolean lIiIiIilliIiIiIill;
   private final boolean iilIiIillIIiIiIill;
   private final float lllIiIillillIiIill;

   public void iIlIlllllill(float from, float to, float thick, float deg) {
      long var11 = 1644401836285186731L;
      var11 ^= ((long)Math.round(from / 90.0F) << 32 ^ var11) & -1L << 32;
      if (Math.abs(from - (float)((int)(var11 >>> 32)) * 90.0F) < 0.01F) {
         float var13 = deg / 2.0F;
         switch (((int)(var11 >>> 32) % 4 + 4) % 4) {
            case 0:
               this.liiiIIllIl(to, -var13, thick, var13);
               break;
            case 1:
               this.liiiIIllIl(-var13, to, var13, thick);
               break;
            case 2:
               this.liiiIIllIl(-thick, -var13, -to, var13);
               break;
            default:
               this.liiiIIllIl(-var13, -thick, var13, -to);
         }
      } else {
         double var6 = Math.toRadians((double)from);
         float var8 = (to + thick) / 2.0F;
         float var9 = (thick - to) / 2.0F / this.IlIIiIillllIIiIill;
         float var10 = deg / 2.0F / this.IlIIiIillllIIiIill;
         this.Illlllllilll(
            0,
            this.ilIIiIillIiIIiIill + (float)Math.cos(var6) * var8 / this.IlIIiIillllIIiIill,
            this.liIIiIilliiIIiIill + (float)Math.sin(var6) * var8 / this.IlIIiIillllIIiIill,
            var9,
            var10,
            this.iilIiIillIIiIiIill ? Math.min(var9, var10) : 0.0F,
            (float)var6,
            0.0F,
            0.0F
         );
      }
   }

   public void lIiiIiIlilli(float r) {
      float var2 = r / this.IlIIiIillllIIiIill;
      this.Illlllllilll(0, this.ilIIiIillIiIIiIill, this.liIIiIilliiIIiIill, var2, var2, var2, 0.0F, 0.0F, 0.0F);
   }

   public void Iilllilliill() {
      if (!this.lIiIiIilliIiIiIill && !this.IliIiIilllliIiIill.isEmpty()) {
         float var1 = IliiIilliiIi.ilIlllIIlIiIlllIIl;
         float var2 = (float)(this.IIlIiIilllIlIiIill >> 16 & 0xFF) / 255.0F;
         float var3 = (float)(this.IIlIiIilllIlIiIill >> 8 & 0xFF) / 255.0F;
         float var4 = (float)(this.IIlIiIilllIlIiIill & 0xFF) / 255.0F;
         float var5 = (float)(this.IIlIiIilllIlIiIill >>> 24 & 0xFF) / 255.0F * var1;
         float var6 = (float)(this.iIlIiIillIllIiIill >> 16 & 0xFF) / 255.0F;
         float var7 = (float)(this.iIlIiIillIllIiIill >> 8 & 0xFF) / 255.0F;
         float var8 = (float)(this.iIlIiIillIllIiIill & 0xFF) / 255.0F;
         float var9 = (float)(this.iIlIiIillIllIiIill >>> 24 & 0xFF) / 255.0F * var1;
         if (this.lllIiIillillIiIill > 0.0F || this.IilIiIilllilIiIill > 0.0F) {
            for (IIliilillIliilil var11 : this.IliIiIilllliIiIill) {
               this.IIillIiliIil(var11, 1, var2, var3, var4, var5, var6, var7, var8, var9);
            }
         }

         for (IIliilillIliilil var13 : this.IliIiIilllliIiIill) {
            this.IIillIiliIil(var13, 2, var2, var3, var4, var5, var6, var7, var8, var9);
         }

         this.IliIiIilllliIiIill.clear();
      }
   }

   public float IliIlllilIi() {
      return this.iliIiIillIiiIiIill;
   }

   public void IlIlllIlilIl(float cornerR, float deg, float stroke, float half) {
      long var9 = -7245636358270403265L;
      float var5 = cornerR / this.IlIIiIillllIIiIill;
      float var6 = deg / 2.0F / this.IlIIiIillllIIiIill;
      var9 ^= ((long)Math.round(stroke / 90.0F) << 32 ^ var9) & -1L << 32;
      if (Math.abs(stroke - (float)((int)(var9 >>> 32)) * 90.0F) < 0.01F) {
         float var8 = Math.max(1.0F, (float)Math.round(var6 * 2.0F));
         var6 = var8 / 2.0F;
         var5 = var8 % 2.0F == 0.0F ? (float)Math.round(var5) : (float)Math.floor((double)var5) + 0.5F;
         stroke = 0.0F;
      }

      this.Illlllllilll(
         0, this.ilIIiIillIiIIiIill, this.liIIiIilliiIIiIill, var5, var5, half / this.IlIIiIillllIIiIill, (float)Math.toRadians((double)stroke), var6, 0.0F
      );
   }

   public void IIIllIIliIIl(float stroke, float sweepDeg, float centreDeg, float r) {
      float var5 = (stroke + sweepDeg / 2.0F) / this.IlIIiIillllIIiIill;
      float var6 = Math.max(0.0F, (stroke - sweepDeg / 2.0F) / this.IlIIiIillllIIiIill);
      float var7 = r >= 360.0F ? 10.0F : (float)Math.toRadians((double)(r / 2.0F));
      this.Illlllllilll(1, this.ilIIiIillIiIIiIill, this.liIIiIilliiIIiIill, var5, var5, 0.0F, (float)Math.toRadians((double)(centreDeg - 90.0F)), var6, var7);
   }

   public void IiIlliIliiIl(float dist, float deg, float halfSide) {
      double var4 = Math.toRadians((double)dist);
      this.Illlllllilll(
         2,
         this.ilIIiIillIiIIiIill + (float)Math.cos(var4) * deg / this.IlIIiIillllIIiIill,
         this.liIIiIilliiIIiIill + (float)Math.sin(var4) * deg / this.IlIIiIillllIIiIill,
         halfSide / this.IlIIiIillllIIiIill,
         0.0F,
         0.0F,
         (float)Math.toRadians((double)(dist + 90.0F)),
         0.0F,
         0.0F
      );
   }

   private void IIillIiliIil(IIliilillIliilil b, int p, float mode, float og, float a, float g, float oa, float r, float ob, float or) {
      float var11 = (b.lliIllllil - b.IlIlllllil) * this.IlIIiIillllIIiIill;
      float var12 = (b.lliIllllil + b.IlIlllllil) * this.IlIIiIillllIIiIill;
      float var13 = (b.iliIllllil - b.IlIlllllil) * this.IlIIiIillllIIiIill;
      float var14 = (b.iliIllllil + b.IlIlllllil) * this.IlIIiIillllIIiIill;
      IliiIilliiIi.Illillliilli(
         IIiilIilllIiilIill,
         var11,
         var13,
         var12,
         var14,
         b.IliIllllil,
         p,
         b.lliIllllil,
         b.iliIllllil,
         b.IiiIllllil,
         b.liiIllllil,
         b.iiiIllllil,
         b.IIIlllllil,
         b.lIIlllllil,
         b.iIIlllllil,
         this.lllIiIillillIiIill,
         this.IilIiIilllilIiIill,
         mode,
         og,
         a,
         g,
         oa,
         r,
         ob,
         or
      );
   }

   private float IIlllIlliIll(float guiOffset) {
      float var2 = guiOffset / this.IlIIiIillllIIiIill;
      return Math.signum(var2) * (float)Math.floor((double)(Math.abs(var2) + 0.5F));
   }

   public void iliIiiliiiii(float r, float stroke) {
      this.IIIllIIliIIl(r, stroke, 0.0F, 360.0F);
   }

   static int Ililllililil(int argb) {
      long var6 = 3055603131789899439L;
      float var1 = (float)(argb >> 16 & 0xFF) / 255.0F;
      float var2 = (float)(argb >> 8 & 0xFF) / 255.0F;
      float var3 = (float)(argb & 0xFF) / 255.0F;
      float var4 = 0.2126F * var1 + 0.7152F * var2 + 0.0722F * var3;
      var6 ^= ((long)Math.round((float)(argb >>> 24 & 0xFF) * 0.8F) << 32 ^ var6) & -1L << 32;
      return var4 > 0.45F ? (int)(var6 >>> 32) << 24 : (int)(var6 >>> 32) << 24 | 16777215;
   }

   private void Illlllllilll(int hh, float hw, float fx, float arcHalf, float radius, float fy, float shape, float inner, float angle) {
      float var10 = switch (hh) {
         case 1 -> arcHalf;
         case 2 -> arcHalf * 1.1547F;
         default -> (float)Math.hypot((double)arcHalf, (double)radius);
      };
      float var11 = this.lllIiIillillIiIill + this.IilIiIilllilIiIill;
      this.iliIiIillIiiIiIill = Math.max(
         this.iliIiIillIiiIiIill,
         ((float)Math.hypot((double)(hw - this.ilIIiIillIiIIiIill), (double)(fx - this.liIIiIilliiIIiIill)) + var10 + var11) * this.IlIIiIillllIIiIill
      );
      if (!this.lIiIiIilliIiIiIill) {
         this.IliIiIilllliIiIill.add(new IIliilillIliilil(hh, hw, fx, arcHalf, radius, fy, shape, inner, angle, var10 + var11 + 1.5F));
      }
   }

   public void liiiIIllIl(float x2, float x1, float y2, float y1) {
      float var5 = this.IIlllIlliIll(Math.min(x2, y2));
      float var6 = this.IIlllIlliIll(Math.max(x2, y2));
      float var7 = this.IIlllIlliIll(Math.min(x1, y1));
      float var8 = this.IIlllIlliIll(Math.max(x1, y1));
      if (var6 - var5 < 1.0F) {
         var6 = var5 + 1.0F;
      }

      if (var8 - var7 < 1.0F) {
         var8 = var7 + 1.0F;
      }

      float var9 = (var6 - var5) / 2.0F;
      float var10 = (var8 - var7) / 2.0F;
      this.Illlllllilll(
         0,
         this.ilIIiIillIiIIiIill + (var5 + var6) / 2.0F,
         this.liIIiIilliiIIiIill + (var7 + var8) / 2.0F,
         var9,
         var10,
         this.iilIiIillIIiIiIill ? Math.min(var9, var10) : 0.0F,
         0.0F,
         0.0F,
         0.0F
      );
   }

   public void IilliliilIIi(float x1, float y2, float thick, float x2, float y1) {
      float var6 = thick - x1;
      float var7 = x2 - y2;
      float var8 = (float)Math.hypot((double)var6, (double)var7);
      if (!(var8 <= 0.001F)) {
         float var9 = var8 / 2.0F / this.IlIIiIillllIIiIill;
         float var10 = y1 / 2.0F / this.IlIIiIillllIIiIill;
         this.Illlllllilll(
            0,
            this.ilIIiIillIiIIiIill + (x1 + thick) / 2.0F / this.IlIIiIillllIIiIill,
            this.liIIiIilliiIIiIill + (y2 + x2) / 2.0F / this.IlIIiIillllIIiIill,
            var9,
            var10,
            this.iilIiIillIIiIiIill ? Math.min(var9, var10) : 0.0F,
            (float)Math.atan2((double)var7, (double)var6),
            0.0F,
            0.0F
         );
      }
   }

   public iiiIiIlIIIliIl(float glow, float cx, int dry, boolean cy, boolean argb, boolean rounded, boolean outline) {
      this.lIiIiIilliIiIiIill = outline;
      this.IlIIiIillllIIiIill = outline ? 1.0F : IliiIilliiIi.Illlllllilll();
      this.ilIIiIillIiIIiIill = glow / this.IlIIiIillllIIiIill;
      this.liIIiIilliiIIiIill = cx / this.IlIIiIillllIIiIill;
      this.IIlIiIilllIlIiIill = dry;
      this.iIlIiIillIllIiIill = cy ? Ililllililil(dry) : 0;
      this.lllIiIillillIiIill = cy ? Math.max(1.0F, 0.55F / this.IlIIiIillllIIiIill) : 0.0F;
      this.IilIiIilllilIiIill = argb ? 2.5F / this.IlIIiIillllIIiIill : 0.0F;
      this.iilIiIillIIiIiIill = rounded;
   }
}
