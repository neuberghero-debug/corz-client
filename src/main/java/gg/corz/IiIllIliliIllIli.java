package gg.corz;

import com.corz.client.mixins.AccessorInventoryScreen;
import net.minecraft.class_10017;
import net.minecraft.class_10042;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class IiIllIliliIllIli {
   private static final float iIlllIllIi = 0.8F;
   private boolean lllllIllIi;
   private static final float liIllIllIi = 152.0F;
   private double illllIllIi;
   private static final int IIlllIllIi = -334754800;
   private static final float iiIllIllIi = 6.0F;
   private long lilllIllIi;
   private static final int lIlllIllIi = 318767103;
   private final iIIllilIlIllil IllllIllIi = new iIIllilIlIllil(152.0F, 6.0F, 1.0F, 1.0F, 1.0F);
   private double IilllIllIi;
   private static final float IiIllIllIi = (float) (Math.PI / 180.0);

   public void iIlIlllllill(double mx, double my) {
      if (this.lllllIllIi) {
         this.IllllIllIi.iIlIlllllill(mx - this.illllIllIi, my - this.IilllIllIi);
         this.illllIllIi = mx;
         this.IilllIllIi = my;
      }
   }

   public void IliIlllilIi(class_332 x, int y, int ctx, int cape, int w, class_2960 h) {
      long var23 = 4075324858259938060L;
      IIIiiIillIIiiIil.Ililllililil(
         x, (float)y, (float)ctx, (float)cape, (float)w, 6.0F, IliiIilliiIi.IlIlllIlilIl(-334754800), IliiIilliiIi.IlIlllIlilIl(318767103)
      );
      class_310 var7 = class_310.method_1551();
      if (var7.field_1724 != null) {
         if (!lillliiliillliil.liIlliiIll()) {
            long var8 = System.nanoTime();
            float var10 = this.lilllIllIi == 0L ? 0.0F : Math.min(0.1F, (float)(var8 - this.lilllIllIi) / 1.0E9F);
            this.lilllIllIi = var8;
            this.IllllIllIi.IIlllIlliIll(var10);
            float var11 = this.IllllIllIi.Illlllllilll();
            float var12 = this.IllllIllIi.Iilllilliill();
            float var13 = IliiIilliiIi.IIIllIIliIIl();
            if (!(var13 < 0.8F)) {
               float var14 = Math.min(1.0F, (var13 - 0.8F) / 0.19999999F);
               var14 = var14 * var14 * (3.0F - 2.0F * var14);
               var23 ^= ((long)Math.max(20, (int)((float)w * 0.46F * (0.9F + 0.1F * var14))) << 32 ^ var23) & -1L << 32;
               class_2960 var16 = iIllIIlIlllIIl.IilllliIllilllliIl;
               iIllIIlIlllIIl.IilllliIllilllliIl = h;
               llliIIllilliIIll.liiiIIllIl(var11);
               var23 ^= ((long)IiiIiiIlliiIiiIl.IlliIlIlll ^ var23) & -1L >>> 32;
               IiiIiiIlliiIiiIl.IlliIlIlll = -2;

               try {
                  class_10017 var18 = AccessorInventoryScreen.corzBuildEntityState(var7.field_1724);
                  Quaternionf var19 = new Quaternionf().rotateZ((float) Math.PI);
                  Quaternionf var20 = new Quaternionf().rotateX(var12 * (float) (Math.PI / 180.0));
                  var19.mul(var20);
                  if (var18 instanceof class_10042 var21) {
                     var21.field_53446 = 180.0F + var11;
                     var21.field_53447 = 0.0F;
                     var21.field_53448 = 0.0F;
                     if (var21.field_53453 != 0.0F) {
                        var21.field_53329 = var21.field_53329 / var21.field_53453;
                        var21.field_53330 = var21.field_53330 / var21.field_53453;
                        var21.field_53453 = 1.0F;
                     }
                  }

                  Vector3f var30 = new Vector3f(0.0F, var18.field_53330 / 2.0F, 0.0F);
                  x.method_70856(var18, (float)((int)(var23 >>> 32)), var30, var19, var20, y + 2, ctx + 2, y + cape - 2, ctx + w - 2);
               } catch (Exception var27) {
               } finally {
                  llliIIllilliIIll.iIlIlllllill();
                  iIllIIlIlllIIl.IilllliIllilllliIl = var16;
                  IiiIiiIlliiIiiIl.IlliIlIlll = (int)var23;
               }
            }
         }
      }
   }

   public void IilliliilIIi() {
      if (this.lllllIllIi) {
         this.IllllIllIi.IilliliilIIi();
      }

      this.lllllIllIi = false;
   }

   public boolean liiiIIllIl(double y, double w, int mx, int x, int h, int button, int my) {
      if (my == 0 && y >= (double)mx && y <= (double)(mx + h) && w >= (double)x && w <= (double)(x + button)) {
         this.lllllIllIi = true;
         this.illllIllIi = y;
         this.IilllIllIi = w;
         this.IllllIllIi.liiiIIllIl();
         return true;
      } else {
         return false;
      }
   }
}
