package gg.corz;

import com.corz.client.CorzClient;
import net.minecraft.class_1041;
import net.minecraft.class_11246;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_4587;

public abstract class Iliilliiilii extends class_437 implements Iilililiiili, Illillliilli, IIiilIiiiIii {
   private boolean iIlillIllill;
   private boolean Iililllilill;
   private boolean lllillillill;
   private class_332 liIilliiIill;
   private boolean IIlilllIlill;
   protected final liiiliiliiiiliil iiilllIIIill;
   private static final int iIilllIlilll = -10000;
   private final class_11246 ilIillIiIill;
   private final String lIIilliIIill;
   private static boolean llilllililll;
   protected final class_437 Iiilllliilll;
   private final class_4587 IlIillllIill = new class_4587();

   protected class_437 IIiIllIiIl() {
      return this.Iiilllliilll;
   }

   public void method_25394(class_332 mouseY, int ctx, int mouseX, float delta) {
      if (!this.lllillillill && !this.Iililllilill) {
         this.iiiIlIIIll(delta);
         CorzClient.fontManager.iIlIlllllill(this.IlIillllIill);
         IIIiiIillIIiiIil.IliIlllilIi(this.IlIillllIill);
         IliiIilliiIi.ilIlllIIlIiIlllIIl = 1.0F;
         IlIIilIlllIIilIl.IilliliilIIi();

         label43: {
            try {
               this.iiilllIIIill.IiIiliIiiiIi(mouseY, (float)this.field_22789, (float)this.field_22790, (double)ctx, (double)mouseX);
               break label43;
            } catch (Throwable var9) {
               this.IlIllllIll();
            } finally {
               IliiIilliiIi.ilIlllIIlIiIlllIIl = 1.0F;
            }

            return;
         }

         if (this.iiilllIIIill.lIiiIiIlilli()) {
            this.IlIllllIll();
         }
      }
   }

   public boolean method_25404(class_11908 input) {
      return this.iiilllIIIill.lIilliIill(input.comp_4795(), input.comp_4797()) ? true : super.method_25404(input);
   }

   protected final void iIiIlIliIl() {
      this.iiilllIIIill.liiiIIllIl();
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      this.iiilllIIIill.IIllllIlll(click.comp_4798(), click.comp_4799(), click.method_74245());
      return true;
   }

   public void method_25419() {
      this.iiilllIIIill.liiiIIllIl();
   }

   public boolean method_25400(class_11905 input) {
      return this.iiilllIIIill.iIlIlllllill() && this.lIlIliIlIl(input.comp_4793(), input.comp_4794()) ? true : super.method_25400(input);
   }

   @Override
   public String liiiIIllIl() {
      return this.lIIilliIIill;
   }

   public class_437 IllIllllIl() {
      return this.Iiilllliilll;
   }

   protected void illIlIilIl() {
   }

   private int lliIliliIl() {
      class_1041 var1 = this.field_22787.method_22683();
      return var1.method_4476((Integer)this.field_22787.field_1690.method_42474().method_41753(), this.field_22787.method_1573());
   }

   private void iiiIlIIIll(float delta) {
      if (this.IiiIlliiIl()) {
         this.Iililllilill = true;

         try {
            if (this.liIilliiIill == null) {
               this.liIilliiIill = new class_332(this.field_22787, this.ilIillIiIill, -10000, -10000);
            }

            this.ilIillIiIill.method_70926();
            this.Iiilllliilll.method_25394(this.liIilliiIill, -10000, -10000, delta);
         } catch (Throwable var6) {
            this.lIIlliIIll(var6);
         } finally {
            this.Iililllilill = false;
            this.ilIillIiIill.method_70926();
            IliiIilliiIi.ilIlllIIlIiIlllIIl = 1.0F;
         }
      }
   }

   public void method_25420(class_332 delta, int mouseY, int ctx, float mouseX) {
   }

   private void IlIllllIll() {
      if (!this.lllillillill) {
         this.lllillillill = true;

         try {
            this.lilIliilIl();
         } finally {
            class_437 var5 = this.IIiIllIiIl();
            if (var5 == this.Iiilllliilll && this.Iiilllliilll instanceof lillliiliillliil var6) {
               var6.liiiIIllIl();
            }

            this.field_22787.method_1507(var5);
            ilIllIiIll(this.field_22787);
         }
      }
   }

   public boolean method_25403(class_11909 dx, double dy, double click) {
      return this.iiilllIIIill.iIlllIllll(dx.comp_4798(), dx.comp_4799(), dx.method_74245(), dy, click);
   }

   public void method_25432() {
      super.method_25432();
      if (!this.lllillillill) {
         class_310 var1 = this.field_22787;
         var1.method_63588(() -> ilIllIiIll(var1));
      }
   }

   private boolean IiiIlliiIl() {
      return !llilllililll && this.Iiilllliilll instanceof Illillliilli && this.Iiilllliilll != this;
   }

   public boolean method_25406(class_11909 click) {
      this.iiilllIIIill.lllllillll(click.comp_4798(), click.comp_4799(), click.method_74245());
      return true;
   }

   protected Iliilliiilii(class_437 title, String parent) {
      super(class_2561.method_43470(parent == null ? "" : parent));
      this.ilIillIiIill = new class_11246();
      this.Iiilllliilll = title;
      this.lIIilliIIill = parent == null ? "" : parent;
      this.iiilllIIIill = new liiiliiliiiiliil(this);
   }

   public boolean method_25401(double horizontal, double mouseY, double mouseX, double vertical) {
      return this.iiilllIIIill.iilllIIill(horizontal, mouseY, vertical);
   }

   private static void ilIllIiIll(class_310 mc) {
      long var3 = -6184656795570114879L;
      if (!(mc.field_1755 instanceof Iilililiiili)) {
         class_1041 var1 = mc.method_22683();
         var3 ^= ((long)var1.method_4476((Integer)mc.field_1690.method_42474().method_41753(), mc.method_1573()) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != var1.method_4495()) {
            mc.method_15993();
         }
      }
   }

   public boolean method_25421() {
      return false;
   }

   protected void lilIliilIl() {
   }

   protected void method_25426() {
      if (!this.IIlilllIlill) {
         this.IIlilllIlill = true;
         if (this.lliIliliIl() != this.field_22787.method_22683().method_4495()) {
            this.field_22787.method_15993();
            return;
         }
      }

      this.iiilllIIIill.Illlllllilll();
      if (this.IiiIlliiIl() && (this.Iiilllliilll.field_22789 != this.field_22789 || this.Iiilllliilll.field_22790 != this.field_22790)) {
         try {
            this.Iiilllliilll.method_25410(this.field_22789, this.field_22790);
         } catch (Throwable var2) {
            this.lIIlliIIll(var2);
         }
      }

      if (!this.iIlillIllill) {
         this.iIlillIllill = true;
         this.iiilllIIIill.IliIlllilIi(this.IiiIlliiIl());
         lllIlliillIlli.liIlliiIll();
         this.illIlIilIl();
      }
   }

   private void lIIlliIIll(Throwable t) {
      llilllililll = true;
      this.liIilliiIill = null;
   }
}
