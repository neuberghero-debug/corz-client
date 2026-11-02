package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1792;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public class IIIlIlIllIIlIlIl extends IilliIllilliIl {
   private final List<class_1792> ilIIliilIl;
   private final List<class_1792> IiIIliilIl;

   public String IiIiliIiiiIi() {
      long var3 = 1770235172947398638L;
      StringBuilder var1 = new StringBuilder();

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiIIliilIl.size(); var5 += 4294967296L) {
         var1.append(class_7923.field_41178.method_10221(this.IiIIliilIl.get((int)(var5 >>> 32))).toString());
         if ((int)(var5 >>> 32) < this.IiIIliilIl.size() - 1) {
            var1.append(IliIlllilIi<"IliIlllilIi","kF4D3yONvBk67zqT1loh66I0g14/6J+uMI/5EYQ=">());
         }
      }

      return var1.toString();
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.IiIiliIiiiIi());
   }

   public void Ililllililil(class_1792 item) {
      if (this.IiIIliilIl.remove(item)) {
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public boolean Iiilliiliiil(class_1792 item) {
      return this.IiIIliilIl.contains(item);
   }

   public void IIillIiliIil(class_1792 item) {
      if (!this.IiIIliilIl.contains(item)) {
         this.IiIIliilIl.add(item);
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void IIlilIliiIli(String data) {
      long var7 = -5991454515831817989L;
      this.IiIIliilIl.clear();
      if (data != null && !data.isBlank()) {
         String[] var2 = data.split(IliIlllilIi<"IliIlllilIi","kF4D3yONvBk67zqT1loh66I0g14/6J+uMI/5EYQ=">());
         var7 ^= ((long)var2.length << 32 ^ var7) & -1L << 32;

         for (long var11 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            String var5 = var2[(int)var11];
            var5 = var5.trim();
            if (!var5.isEmpty()) {
               class_1792 var6 = (class_1792)class_7923.field_41178.method_63535(class_2960.method_60654(var5));
               if (var6 != null) {
                  this.IiIIliilIl.add(var6);
               }
            }
         }

         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void IlIillIiilIi() {
      this.IiIIliilIl.clear();
      this.IiIIliilIl.addAll(this.ilIIliilIl);
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         try {
            this.IIlilIliiIli(element.getAsString());
            return iiiiIlllIIIIllll.lIilllIill;
         } catch (Exception var3) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public IIIlIlIllIIlIlIl(String name, String description, List<class_1792> defaultItems) {
      super(name, description);
      this.ilIIliilIl = new ArrayList<>(defaultItems);
      this.IiIIliilIl = new ArrayList<>(defaultItems);
   }

   public List<class_1792> Iilllilliill() {
      return this.IiIIliilIl;
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.lIiIlIilIl;
   }

   public void IIIilIIiiIIi(class_1792 item) {
      if (this.Iiilliiliiil(item)) {
         this.Ililllililil(item);
      } else {
         this.IIillIiliIil(item);
      }
   }
}
