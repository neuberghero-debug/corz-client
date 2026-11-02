package gg.corz;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_3610;

public final class IiiIiiilliiIiiil implements iIIlIiiIlIlIii {
   private final Map<Long, class_2680> IlllIlIiil;
   private final class_1922 lIllIlIiil;
   private final Map<Long, class_2680> iIllIlIiil = new HashMap<>();

   public class_2586 method_8321(class_2338 pos) {
      return this.iIllIlIiil.containsKey(pos.method_10063()) ? null : this.lIllIlIiil.method_8321(pos);
   }

   public int method_31605() {
      return this.lIllIlIiil.method_31605();
   }

   public IiiIiiilliiIiiil(class_1922 base) {
      this.IlllIlIiil = new HashMap<>();
      this.lIllIlIiil = base;
   }

   public class_3610 method_8316(class_2338 pos) {
      if (!this.iIllIlIiil.isEmpty()) {
         class_2680 var2 = this.iIllIlIiil.get(pos.method_10063());
         if (var2 != null) {
            return var2.method_26227();
         }
      }

      return this.lIllIlIiil.method_8316(pos);
   }

   public void iIlIlllllill() {
      this.iIllIlIiil.clear();
      this.IlllIlIiil.clear();
   }

   public class_2680 method_8320(class_2338 pos) {
      if (!this.iIllIlIiil.isEmpty()) {
         class_2680 var2 = this.iIllIlIiil.get(pos.method_10063());
         if (var2 != null) {
            return var2;
         }
      }

      return this.lIllIlIiil.method_8320(pos);
   }

   @Override
   public void IliIlllilIi(long cell, class_2680 state) {
      if (state != null) {
         class_2680 var4 = this.iIllIlIiil.put(cell, state);
         if (var4 != null) {
            this.IlllIlIiil.put(cell, var4);
         } else {
            this.IlllIlIiil.remove(cell);
         }
      }
   }

   @Override
   public void liiiIIllIl(long cell) {
      class_2680 var3 = this.IlllIlIiil.remove(cell);
      if (var3 != null) {
         this.iIllIlIiil.put(cell, var3);
      } else {
         this.iIllIlIiil.remove(cell);
      }
   }

   public int method_31607() {
      return this.lIllIlIiil.method_31607();
   }
}
