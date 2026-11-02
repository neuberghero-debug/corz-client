package gg.corz;

import com.corz.client.mixins.AccessorClientPlayerInteractionManager;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_746;

final class llIliiiilIliii implements lIliiliiIliili {
   private final lilllllliillllll IIilIIIlIl;
   private final illillIlIilillIl lIilIIIlIl;

   @Override
   public void IIillIiliIil(float pitch, float yaw) {
      this.IIilIIIlIl.iliIiiliiiii(pitch, yaw);
   }

   @Override
   public boolean iliIiiliiiii(class_2338 pos) {
      long var9 = -5397148318030337409L;
      long var11 = -5292766180752496118L;
      long var13 = 7604781076280580138L;
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 != null && pos != null) {
         class_243 var3 = var2.method_73189();
         var9 ^= ((long)((int)Math.floor(var3.field_1351 + 1.0E-4)) << 32 ^ var9) & -1L << 32;
         if (pos.method_10264() != (int)(var9 >>> 32) - 1) {
            return false;
         } else {
            var9 ^= ((long)((int)Math.floor(var3.field_1352 - 0.31)) ^ var9) & -1L >>> 32;
            var11 ^= ((long)((int)Math.floor(var3.field_1352 + 0.31)) << 32 ^ var11) & -1L << 32;
            var11 ^= ((long)((int)Math.floor(var3.field_1350 - 0.31)) ^ var11) & -1L >>> 32;
            var13 ^= ((long)((int)Math.floor(var3.field_1350 + 0.31)) << 32 ^ var13) & -1L << 32;
            return pos.method_10263() >= (int)var9
               && pos.method_10263() <= (int)(var11 >>> 32)
               && pos.method_10260() >= (int)var11
               && pos.method_10260() <= (int)(var13 >>> 32);
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean IiIlliIliiIl(class_2338 yaw, class_2350 pos, float face, float pitch) {
      return IiIiiiilliIiiiil.IliIlllilIi(yaw, pos, 4.5, face, pitch) != null;
   }

   @Override
   public float IIlllIlliIll() {
      return this.IIilIIIlIl.IliIlllilIi();
   }

   @Override
   public int IlIillIiilIi() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 == null ? -1 : var1.method_31548().method_67532();
   }

   @Override
   public Object IiIiliIiiiIi() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 == null ? class_1799.field_8037 : var1.method_6047().method_7972();
   }

   @Override
   public IIIIiiIllIIIiiIl IlIlllIlilIl(class_2338 yaw, float pos, float pitch) {
      class_3965 var4 = IiIiiiilliIiiiil.liiiIIllIl(yaw, iiilIIiIIIiIIi.iIIlliiliIlIlliili, null, 4.5, pos, pitch);
      return var4 == null ? null : new IIIIiiIllIIIiiIl(var4.method_17780(), var4.method_17784());
   }

   @Override
   public double IIIllIIliIIl(class_2338 pos) {
      class_746 var2 = class_310.method_1551().field_1724;
      if (var2 != null && pos != null) {
         class_243 var3 = var2.method_33571();
         double var4 = Math.max(0.0, Math.max((double)pos.method_10263() - var3.field_1352, var3.field_1352 - ((double)pos.method_10263() + 1.0)));
         double var6 = Math.max(0.0, Math.max((double)pos.method_10264() - var3.field_1351, var3.field_1351 - ((double)pos.method_10264() + 1.0)));
         double var8 = Math.max(0.0, Math.max((double)pos.method_10260() - var3.field_1350, var3.field_1350 - ((double)pos.method_10260() + 1.0)));
         return Math.sqrt(var4 * var4 + var6 * var6 + var8 * var8);
      } else {
         return Double.MAX_VALUE;
      }
   }

   @Override
   public boolean Illillliilli() {
      class_310 var1 = class_310.method_1551();
      return var1.field_1761 != null && var1.field_1761.method_2923();
   }

   @Override
   public float[] Iilllilliill(class_243 point) {
      return this.IIilIIIlIl.IlIillIiilIi(point);
   }

   @Override
   public boolean IliIlllilIi() {
      class_310 var1 = class_310.method_1551();
      return var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null;
   }

   @Override
   public float Illlllllilll() {
      return this.IIilIIIlIl.liiiIIllIl();
   }

   @Override
   public boolean IIIilIIiiIIi(int slot) {
      return this.IIilIIIlIl.IIIilIIiiIIi(slot);
   }

   @Override
   public boolean lIiiIiIlilli(class_2338 pos) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1687 != null && pos != null) {
         class_2680 var3 = var2.field_1687.method_8320(pos);
         return var3.method_26215() || var3.method_51176();
      } else {
         return true;
      }
   }

   @Override
   public boolean Iiilliiliiil() {
      return this.IIilIIIlIl.iIlIlllllill()
         && (
            this.lIilIIIlIl.iIlIlllllill()
               || Iiiiliiiiiii<"Iiiiliiiiiii","a6rYlHXvh2PJ8O9TxrzuhPtVElTeev5wC3KOv4vAUhQ+RUtR">().equals(this.lIilIIIlIl.IIillIiliIil())
         );
   }

   @Override
   public boolean iIlIlllllill() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 != null && var1.method_24828();
   }

   @Override
   public long liiiIIllIl() {
      return this.IIilIIIlIl.IIillIiliIil();
   }

   @Override
   public void IIiilIiiiIii() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1761 != null) {
         try (IlIIiiIillIIiiIi var2 = this.lIilIIIlIl.IIlllIlliIll()) {
            var1.field_1761.method_2925();
         }
      }
   }

   @Override
   public boolean IIlilIliiIli(Object snapshot) {
      class_746 var2 = class_310.method_1551().field_1724;
      return var2 != null && snapshot instanceof class_1799 var3 ? class_1799.method_31577(var3, var2.method_6047()) : false;
   }

   @Override
   public boolean IilliliilIIi() {
      class_746 var1 = class_310.method_1551().field_1724;
      return var1 != null && var1.method_6115();
   }

   llIliiiilIliii(lilllllliillllll gates, illillIlIilillIl host) {
      this.IIilIIIlIl = gates;
      this.lIilIIIlIl = host;
   }

   @Override
   public boolean Iliilliiilii(class_2338 pos, int elapsed) {
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1687 != null && var3.field_1761 != null && pos != null) {
         float var5 = var3.field_1687.method_8320(pos).method_26165(var4, var3.field_1687, pos);
         float var6 = ((AccessorClientPlayerInteractionManager)var3.field_1761).corzBreakingProgress();
         return iiilIIiIIIiIIi.IliIlllilIi(var6, var5, elapsed);
      } else {
         return true;
      }
   }

   @Override
   public boolean Iilililiiili(class_2338 pos, class_2350 face) {
      long var8 = 4948156579517594340L;
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1761 != null) {
         try (IlIIiiIillIIiiIi var5 = this.lIilIIIlIl.IIlllIlliIll()) {
            if (var3.field_1761.method_2902(pos, face)) {
               var4.method_6104(class_1268.field_5808);
               var8 ^= (4294967296L ^ var8) & -1L << 32;
               return (boolean)((int)(var8 >>> 32));
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean Ililllililil() {
      return this.IIilIIIlIl.iIlIlllllill() && this.lIilIIIlIl.iIlIlllllill();
   }
}
