package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_243;
import net.minecraft.class_2828;
import org.joml.Matrix4f;

public class lIllliliIlllil extends ilIllIiIll {
   private static final int llIiIIIliilIiIIIli = -872415232;
   private static final int iiIiIIIliIIliIIIli = -866792193;
   private final iilliIlIIiliIl IIiiIIIlilIiiIIIli;
   private static final float liilIIIliiiilIIIli = 0.01F;
   private float iiiiIIIliIIIIlIIli;
   private final iiIiiilIIliiil liliIIIliiiliIIIli;
   private long iilIlIIliIIiIlIIli;
   private int lllIlIIliillIlIIli;
   private static final int IlilIIIlillilIIIli = 512;
   private final List<class_243> iIiiIIIliIliiIIIli;
   private final iiIiiilIIliiil illiIIIliIiliIIIli;
   private final IiIllliliIllli lliiIIIliiliiIIIli;
   private static final int IiIiIIIliliIiIIIli = 861261055;
   private int iIlIlIIliIllIlIIli;
   private float liIIlIIliiiIIlIIli;
   private static final float ililIIIliIiilIIIli = 0.1F;
   private float ilIIlIIliIiIIlIIli;
   private float IIlIlIIlilIlIlIIli;
   private static final float lIliIIIliiIliIIIli = 1.5F;
   private static final long lIilIIIliiIilIIIli = 10000L;
   private final iiIiiilIIliiil IlliIIIlillliIIIli = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","CF7EkkEE8P4Yp0lJp76kbWT6Q0rRHbhuCyEMJDnUvutdp8JHc3wE">(),
      IliIlllilIi<"IliIlllilIi","+8/G+SpM7q29j5qTyDQhlCrb9/VZRVPaPkLudshazKlHMvqgdlXbC0Xsx4R03lM4AueY3OZJR3Kq1n1JPhVSpO0wTMv9WmcGAvkqR0yrjiE1o69Eu6OmUbdXzuWGR0PpS7lG3RggqgE/nGc=">(),
      false
   );
   private long IilIlIIlililIlIIli;
   private float lIIIlIIliiIIIlIIli;
   private static final int IIIiIIIlilIIiIIIli = -855644672;
   private class_243 IiiiIIIliliiiIIIli;
   private float IlIIlIIlillIIlIIli;
   private static final int iIIiIIIliIlIiIIIli = -855691216;

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1724 != null) {
         Matrix4f var2 = iIiiIIilIliiIIil.IIillIiliIil();
         if (this.IlliIIIlillliIIIli.Iilllilliill() && !this.iIiiIIIliIliiIIIli.isEmpty()) {
            this.ilIllIiIll(var2);
         }

         if (this.IiiiIIIliliiiIIIli != null && !lillliliilllil.iIlIlllllill(Iiiilllliiilll.field_1687)) {
            this.liIlliiIll(var2);
         }
      }
   }

   private void lIIlliIIll() {
      if (this.IiiiIIIliliiiIIIli != null) {
         lillliliilllil.IliIlllilIi(
            Iiiilllliiilll.field_1687,
            Iiiilllliiilll.field_1724,
            this.IiiiIIIliliiiIIIli,
            this.iiiiIIIliIIIIlIIli,
            this.lIIIlIIliiIIIlIIli,
            this.IlIIlIIlillIIlIIli,
            this.ilIIlIIliIiIIlIIli
         );
      }
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.method_18854() && Iiiilllliiilll.field_1724 != null && this.lliiIIIliiliiIIIli.liiiIIllIl(Iiiilllliiilll.field_1687)) {
         if (!event.lIiiIiIlilli()) {
            if (iiIliillIIlliill.IliIlllilIi(this, event, 730276941449267202L ^ 8493095095405508605L)) {
               this.iIlIlIIliIllIlIIli++;
               if (event.lIiilIIIIi instanceof class_2828 var2 && var2.method_36171()) {
                  this.IlIllllIll(var2);
               }
            }
         }
      }
   }

   private void IlIllllIll(class_2828 move) {
      this.lllIlIIliillIlIIli++;
      if (lillIiiiillIii.IliIlllilIi(this.lllIlIIliillIlIIli) && this.iIiiIIIliIliiIIIli.size() < (-1202440203 * 83 + -89 ^ -1018288618)) {
         double var2 = move.method_12269(Iiiilllliiilll.field_1724.method_23317());
         double var4 = move.method_12268(Iiiilllliiilll.field_1724.method_23318());
         double var6 = move.method_12274(Iiiilllliiilll.field_1724.method_23321());
         class_243 var8 = this.iIiiIIIliIliiIIIli.isEmpty() ? null : this.iIiiIIIliIliiIIIli.get(this.iIiiIIIliIliiIIIli.size() - 1);
         if (var8 == null || lillIiiiillIii.iIlIlllllill(var8.field_1352, var8.field_1350, var2, var6)) {
            double[] var9 = lillIiiiillIii.liiiIIllIl(this.iIiiIIIliIliiIIIli.size(), move.method_12271(Iiiilllliiilll.field_1724.method_36454()));
            this.iIiiIIIliIliiIIIli.add(new class_243(var2 + var9[0], var4, var6 + var9[1]));
         }
      }
   }

   private void ilIllIiIll(Matrix4f m) {
      for (int var2 = 0; var2 < this.iIiiIIIliIliiIIIli.size(); var2++) {
         class_243 var3 = this.iIiiIIIliIliiIIIli.get(var2);
         if (!iIiiIIilIliiIIil.IlIillIiilIi(var3.field_1352, var3.field_1351, var3.field_1350, 0.5F)) {
            float var4 = iIiiIIilIliiIIil.Ililllililil(var3.field_1352 - 0.1F);
            float var5 = iIiiIIilIliiIIil.Ililllililil(var3.field_1352 + 0.1F);
            float var6 = iIiiIIilIliiIIil.IIIilIIiiIIi(var3.field_1350 - 0.1F);
            float var7 = iIiiIIilIliiIIil.IIIilIIiiIIi(var3.field_1350 + 0.1F);
            float var8 = iIiiIIilIliiIIil.Iiilliiliiil(var3.field_1351 + 0.01F);
            iIiiIIilIliiIIil.Illillliilli(m, var4, var8, var6, var4, var8, var7, var5, var8, var7, var5, var8, var6, var2 == 0 ? -855644672 : -855691216);
            iIiiIIilIliiIIil.Iliilliiilii(m, var4, var8, var6, var5, var8, var6, -872415232, 1.5F);
            iIiiIIilIliiIIil.Iliilliiilii(m, var5, var8, var6, var5, var8, var7, -872415232, 1.5F);
            iIiiIIilIliiIIil.Iliilliiilii(m, var5, var8, var7, var4, var8, var7, -872415232, 1.5F);
            iIiiIIilIliiIIil.Iliilliiilii(m, var4, var8, var7, var4, var8, var6, -872415232, 1.5F);
         }
      }
   }

   public lIllliliIlllil() {
      super(IliIlllilIi<"IliIlllilIi","bOQpg8Q65kfmzy2JiShYKJY4s+xU1WK2/gzbMg7WfrbF">(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.illiIIIliIiliIIIli = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","BU1inaVrrakBau27Sm+ZM8bQNCmiWsNaju6GR3A1ODbszTi79go=">(),
         IliIlllilIi<"IliIlllilIi","pP5HdXdDM5ip7ZazYraAFIl9iHBi7bVmp/3kFfKkpCKYPrKhV1K+VOhKal8rnh6Vo+UQpIBfES+9CXjfzoOxH5/vyLPe7T1xKkcjNoDGudhEq+irFtg=">(),
         true
      );
      this.liliIIIliiiliIIIli = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","lBgdU7zhtwTPj+Svi+6Mzy/Da0t0xcKm4P7lyGih2HsWIgcKjg==">(),
         IliIlllilIi<"IliIlllilIi","ALJitaAlB7qmRvH75Bs8jfd8BsGWQIjz7gqh6FR7Jw1JJCcQYzORv7mbnPXDutXU+tHSgt9ajAnxa9yI+MnHiocKQ/6B5QhtxyOQRLiUdiUOzegW9o+b04XSilkB2mrDG8qov1o+eKU=">(),
         false
      );
      this.IIiiIIIlilIiiIIIli = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","W/LXOHhqy4XMMkqtDty72tZEbd2gvsMm6mF0gJQnO6DhPstafAKnCGSZ">(),
         IliIlllilIi<"IliIlllilIi","Maq1Qe8DZ1CC40CvRFGU9BSE+De7vHGXUyri3nHpn5/LLCg32yNDHZk7SaDL/5T6YDlOKYH02F753OVr7IroYwvYcECLxd36Um2nl/XeejKueW5TtXJh4XWBxOsImwEDREzz">(),
         -2134445069 * 57 - -53 ^ -1404284574,
         0,
         (((-1978410434 + -23) * -89 << 25 | (-1978410434 + -23) * -89 >>> 7) << 29 | ((-1978410434 + -23) * -89 << 25 | (-1978410434 + -23) * -89 >>> 7) >>> 3)
            ^ 478135854
      );
      this.iIiiIIIliIliiIIIli = new ArrayList<>();
      this.lliiIIIliiliiIIIli = new IiIllliliIllli();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlliIIIlillliIIIli, this.illiIIIliIiliIIIli, this.liliIIIliiiliIIIli, this.IIiiIIIlilIiiIIIli});
   }

   @Override
   protected void Iilililiiili() {
      iiIliillIIlliill.iliIiiliiiii(this);
      lillliliilllil.liiiIIllIl();
      this.iIiiIIIliIliiIIIli.clear();
      this.IiiiIIIliliiiIIIli = null;
      this.iIlIlIIliIllIlIIli = 0;
      this.lllIlIIliillIlIIli = 0;
      this.lliiIIIliiliiIIIli.iIlIlllllill();
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (this.lliiIIIliiliiIIIli.liiiIIllIl(Iiiilllliiilll.field_1687) && !Iiiilllliiilll.field_1724.method_29504()) {
            long var1 = IIIiillllIIiilll.iIlIlllllill();
            if (var1 != this.iilIlIIliIIiIlIIli) {
               this.iilIlIIliIIiIlIIli = var1;
               if (!this.liliIIIliiiliIIIli.Iilllilliill()) {
                  this.IIillIiliIil(false);
               } else {
                  iiIliillIIlliill.iliIiiliiiii(this);
                  this.iiiIlIIIll();
               }
            } else if (!lillIiiiillIii.IilliliilIIi(this.liliIIIliiiliIIIli.Iilllilliill(), this.IIiiIIIlilIiiIIIli.Iilllilliill(), this.iIlIlIIliIllIlIIli)
               && !lillIiiiillIii.lIiiIiIlilli(this.IilIlIIlililIlIIli, IIIiillllIIiilll.IliIlllilIi(), 10000L)) {
               if (!this.illiIIIliIiliIIIli.Iilllilliill()) {
                  lillliliilllil.liiiIIllIl();
               } else if (!lillliliilllil.iIlIlllllill(Iiiilllliiilll.field_1687)) {
                  this.lIIlliIIll();
               }
            } else {
               iiIliillIIlliill.iliIiiliiiii(this);
               this.iiiIlIIIll();
            }
         } else {
            this.IIillIiliIil(false);
         }
      }
   }

   private void iiiIlIIIll() {
      this.iIlIlIIliIllIlIIli = 0;
      this.lllIlIIliillIlIIli = 0;
      this.IilIlIIlililIlIIli = IIIiillllIIiilll.IliIlllilIi();
      this.IiiiIIIliliiiIIIli = Iiiilllliiilll.field_1724.method_73189();
      this.iiiiIIIliIIIIlIIli = Iiiilllliiilll.field_1724.method_36454();
      this.lIIIlIIliiIIIlIIli = Iiiilllliiilll.field_1724.method_36455();
      this.IlIIlIIlillIIlIIli = Iiiilllliiilll.field_1724.method_5791();
      this.ilIIlIIliIiIIlIIli = Iiiilllliiilll.field_1724.method_73188();
      this.liIIlIIliiiIIlIIli = Iiiilllliiilll.field_1724.method_17681();
      this.IIlIlIIlilIlIlIIli = Iiiilllliiilll.field_1724.method_17682();
      this.iIiiIIIliIliiIIIli.clear();
      this.iIiiIIIliIliiIIIli.add(this.IiiiIIIliliiiIIIli);
      if (this.illiIIIliIiliIIIli.Iilllilliill()) {
         this.lIIlliIIll();
      } else {
         lillliliilllil.liiiIIllIl();
      }
   }

   private void liIlliiIll(Matrix4f m) {
      class_243 var2 = this.IiiiIIIliliiiIIIli;
      float var3 = this.liIIlIIliiiIIlIIli / 2.0F;
      if (!iIiiIIilIliiIIil.IlIillIiilIi(var2.field_1352, var2.field_1351 + (double)this.IIlIlIIlilIlIlIIli / 2.0, var2.field_1350, this.IIlIlIIlilIlIlIIli)) {
         float var4 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 - (double)var3);
         float var5 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351);
         float var6 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 - (double)var3);
         float var7 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 + (double)var3);
         float var8 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351 + (double)this.IIlIlIIlilIlIlIIli);
         float var9 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 + (double)var3);
         iIiiIIilIliiIIil.IIlilIliiIli(m, var4, var5, var6, var7, var8, var9, 0.33333334F, 0.8F, 1.0F, 0.2F);
         iIiiIIilIliiIIil.iIIIlIlIIl(m, var4, var5, var6, var7, var8, var9, -866792193, 1.5F);
      }
   }

   @Override
   protected void Illillliilli() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.lliiIIIliiliiIIIli.IliIlllilIi(Iiiilllliiilll.field_1687);
         this.iilIlIIliIIiIlIIli = IIIiillllIIiilll.iIlIlllllill();
         this.iiiIlIIIll();
      } else {
         this.IIillIiliIil(false);
      }
   }
}
