package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_3532;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public class iliIIllIiiIIll extends ilIllIiIll {
   private boolean lIiliIIiliIiliIIil;
   private static final float IiiIiIIilliiIiIIil = 0.5F;
   private float ililiIIilIiiliIIil;
   private int IIlliIIillIlliIIil;
   private int iilliIIilIIiliIIil;
   private boolean IilliIIillilliIIil;
   private static final int ilIliIIilIiIliIIil = 2;
   private final iiIiiilIIliiil liIliIIiliiIliIIil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","/m4CLNcO+oHu7zY2Cr05058riRDH31p+QKkB3vBi10Q=">(),
      IliIlllilIi<"IliIlllilIi","w3qR6SLWm15V2VZduOIxZS0hx/Ol4zGkAGKqSOjrLPwbommvIEkJ3NA6UGPiG9bucHWsKZwJApivrAishL1yCuNObRQtosfoKPPOib8/O4+ruHzyXgpK5KUDiiFgm9xaBK7jGPstpX0uUtH2quMEAkk+T91PhQVA0YebwNDwy3nmvnZJgSsWyAuAsDr94eMukJU9vYhEBWDWYf/7F3JpFKHz8bKGj+vBqT/VIlfodoEIDGfYSrsl5hAXkwibYT73uZB5IhGsygUpiPT4wg==">(),
      true
   );
   private boolean lllliIIilillliIIil;
   private static final float IlIliIIilllIliIIil = 1.0F;
   private boolean iIlliIIilIllliIIil;
   private static final float lIIliIIiliIIliIIil = 8.0F;
   private float IliliIIillliliIIil;
   private static final float iiiIiIIilIIIliIIil = 60.0F;

   private boolean lIIlliIIll() {
      if (Iiiilllliiilll.field_1690 != null && Iiiilllliiilll.method_22683() != null) {
         long var1 = Iiiilllliiilll.method_22683().method_4490();
         class_306 var3 = ((AccessorKeyBinding)Iiiilllliiilll.field_1690.field_1903).getBoundKey();
         if (var3.method_1442() == class_307.field_1668) {
            return GLFW.glfwGetKey(var1, var3.method_1444()) == (-(~(-(1922101676 * -99))) ^ 1309504900);
         } else {
            return var3.method_1442() == class_307.field_1672
               ? GLFW.glfwGetMouseButton(var1, var3.method_1444()) == ((-1168675134 >>> 9 | -1168675134 << 23) * 1749801491 * 123 + -45 ^ 1237640043)
               : false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         if (Iiiilllliiilll.field_1755 != null) {
            this.lIiliIIiliIiliIIil = false;
         } else if (this.lllliIIilillliIIil) {
            this.iiiIlIIIll();
            if (this.IIlliIIillIlliIIil != -1 && Iiiilllliiilll.field_1724.method_31548().method_67532() != this.IIlliIIillIlliIIil) {
               Iiiilllliiilll.field_1724.method_31548().method_61496(this.IIlliIIillIlliIIil);
            }

            this.IIlliIIillIlliIIil = -1;
            this.lIiliIIiliIiliIIil = false;
            this.IIillIiliIil(false);
         } else {
            int var1 = IilIIililIIi.lIiiIiIlilli(class_1802.field_49098);
            if (var1 == -1) {
               this.lIiliIIiliIiliIIil = false;
               this.IIillIiliIil(false);
            } else {
               if (!this.iIlliIIilIllliIIil) {
                  int var2 = Iiiilllliiilll.field_1724.method_31548().method_67532();
                  this.IIlliIIillIlliIIil = var2 != var1 ? var2 : -1;
                  if (var2 != var1) {
                     Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
                  }

                  this.iIlliIIilIllliIIil = true;
               }

               this.IliliIIillliliIIil = Iiiilllliiilll.field_1724.method_36455();
               this.lIiliIIiliIiliIIil = true;
               float var3 = class_3532.method_15363(lilllliillll.liiiIIllIl(this.IliliIIillliliIIil, 90.0F, 0.5F, 60.0F, 8.0F), -90.0F, 90.0F);
               Iiiilllliiilll.field_1724.method_36457(var3);
               this.ililiIIilIiiliIIil = var3;
               this.iilliIIilIIiliIIil++;
               if (this.iilliIIilIIiliIIil >= 2 && 90.0F - var3 <= 1.0F && Iiiilllliiilll.field_1724.method_24828()) {
                  if (this.liIliIIiliiIliIIil.Iilllilliill() && Iiiilllliiilll.field_1690 != null) {
                     Iiiilllliiilll.field_1690.field_1903.method_23481(true);
                     this.IilliIIillilliIIil = true;
                  }

                  Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
                  Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                  this.lllliIIilillliIIil = true;
               }
            }
         }
      }
   }

   @Override
   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      if (this.lIiliIIiliIiliIIil && Iiiilllliiilll.field_1724 != null) {
         e.IIlllIlliIll(class_3532.method_16439(e.Illlllllilll(), this.IliliIIillliliIIil, this.ililiIIilIiiliIIil));
         e.IIillIiliIil();
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iiiIlIIIll();
      this.lIiliIIiliIiliIIil = false;
      if (this.IIlliIIillIlliIIil != ((-1376087598 - -5 - -75) * 59 ^ -415215063)
         && Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1724.method_31548().method_67532() != this.IIlliIIillIlliIIil) {
         Iiiilllliiilll.field_1724.method_31548().method_61496(this.IIlliIIillIlliIIil);
      }

      this.IIlliIIillIlliIIil = -1;
      this.iIlliIIilIllliIIil = false;
      this.lllliIIilillliIIil = false;
      this.iilliIIilIIiliIIil = 0;
   }

   public iliIIllIiiIIll() {
      super(IliIlllilIi<"IliIlllilIi","b7USirXFv8l95JtjyuXR4MAyKzn8qt4t6wdVcRDIfkjKu4WZLDPUxGUbB8EkmFQ=">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IIlliIIillIlliIIil = -1;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liIliIIiliiIliIIil});
   }

   @Override
   protected void Illillliilli() {
      this.IIlliIIillIlliIIil = -1;
      this.iIlliIIilIllliIIil = false;
      this.lllliIIilillliIIil = false;
      this.iilliIIilIIiliIIil = 0;
      this.lIiliIIiliIiliIIil = false;
      this.iiiIlIIIll();
   }

   private void iiiIlIIIll() {
      if (this.IilliIIillilliIIil && Iiiilllliiilll.field_1690 != null) {
         Iiiilllliiilll.field_1690.field_1903.method_23481(this.lIIlliIIll());
      }

      this.IilliIIillilliIIil = false;
   }
}
