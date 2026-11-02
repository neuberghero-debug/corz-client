package gg.corz;

import com.google.gson.JsonObject;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

public final class llIIiliilIIili {
   public llilIlilililIlil IliIiiIIIl;
   public String iliIiiIIIl;
   public lilIilIiiilIilIi lliIiiIIIl;
   public boolean iIiIiiIIIl = true;
   public int liiIiiIIIl;
   public String IiiIiiIIIl;
   public int iiiIiiIIIl;

   public boolean liiiIIllIl(class_1799 stack) {
      if (this.iIiIiiIIIl && stack != null && !stack.method_7960()) {
         return switch (this.IliIiiIIIl) {
            case iliilIiIil -> {
               class_1792 var2 = IiiIlliiIl.iIlIlllllill(this.iliIiiIIIl);
               yield var2 != null && stack.method_31574(var2);
            }
            case lliilIiIil -> IilliliilIIi(stack, this.IiiIiiIIIl, Math.max(1, this.liiIiiIIIl));
            case IiiilIiIil -> stack.method_31574(class_1802.field_8598);
         };
      } else {
         return false;
      }
   }

   public llIIiliilIIili() {
      this.IliIiiIIIl = llilIlilililIlil.lliilIiIil;
      this.lliIiiIIIl = lilIilIiiilIilIi.lliIIllIIi;
      this.iliIiiIIIl = IIIllIIliIIl<"IIIllIIliIIl","zpHE2sWz9r1GLKl3uXATaOzua3OH7Rom1w7XM/IL028GHbU=">();
      this.IiiIiiIIIl = IIIllIIliIIl<"IIIllIIliIIl","kt6AtfL+Jptfvf5NrfxbFIQFVBsvXsCOU6Z46kptDT2gJ6w=">();
      this.liiIiiIIIl = 1;
      this.iiiIiiIIIl = 0;
   }

   public String iIlIlllllill() {
      String var1 = switch (this.IliIiiIIIl) {
         case iliilIiIil -> this.iliIiiIIIl;
         case lliilIiIil -> this.IiiIiiIIIl
         + IIIllIIliIIl<"IIIllIIliIIl","EEYscyffwXKOOBmd8QEAWllvtuARdoCXnb1efzQ=">()
         + IliiiiIilliiiiIi.iliIiiliiiii(this.liiIiiIIIl)
         + IIIllIIliIIl<"IIIllIIliIIl","FY1y1Ix+UTpTWaaO+3u623W52lZdddhDsKfu+NNX7JUO">();
         case IiiilIiIil -> IIIllIIliIIl<"IIIllIIliIIl","tu3S0N4HNr2KrHe29DPPgzD6Gf1v0O7ysTVvVeDacctBZErraBLFZ4rD9OtGjg==">();
      };
      String var2 = (this.lliIiiIIIl == lilIilIiiilIilIi.lliIIllIIi || this.lliIiiIIIl == lilIilIiiilIilIi.IIIlIllIIi) && this.iiiIiiIIIl > 0
         ? IIIllIIliIIl<"IIIllIIliIIl","+7gZbLYQqHfd0Kj/Cwfcihc5mF5Kews4QtkM/fssOa29tg==">()
            + this.iiiIiiIIIl
            + IIIllIIliIIl<"IIIllIIliIIl","Pu7uk7DP10hJ2ObV00hkGlHZmJM9rb3K+ykdqpQ=">()
         : "";
      return var1 + IIIllIIliIIl<"IIIllIIliIIl","m6NgIs07OYOsEqSRZ+NPipfvxh30Ff63hWIBUnC6+vMF">() + this.lliIiiIIIl + var2;
   }

   public static llIIiliilIIili IliIlllilIi(String action, lilIilIiiilIilIi keepAmount, int item) {
      llIIiliilIIili var3 = new llIIiliilIIili();
      var3.IliIiiIIIl = llilIlilililIlil.lliilIiIil;
      var3.iliIiiIIIl = action;
      var3.lliIiiIIIl = keepAmount;
      var3.iiiIiiIIIl = item;
      return var3;
   }

   public static boolean IilliliilIIi(class_1799 enchantName, String minLevel, int stack) {
      if (enchantName != null && !enchantName.method_7960() && enchantName.method_31574(class_1802.field_8598)) {
         class_9304 var3 = (class_9304)enchantName.method_58695(class_9334.field_49643, class_9304.field_49385);

         for (class_6880 var5 : var3.method_57534()) {
            if (IliiiiIilliiiiIi.iIlIlllllill(var5, minLevel) && var3.method_57536(var5) >= stack) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public JsonObject lIiiIiIlilli() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","CgbgKUshNnfL/ASJElTjJgtTZgG/mjaPQ5xtTfvqK2sdx6E=">(), this.iIiIiiIIIl);
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","Bu+ANGO89WLf6UaFwHBc59TzgD2ad6sNLJilHHJRqWQ=">(), this.IliIiiIIIl.name());
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","yNGpX1XcgBNMjxXOLOJeFKM6WGNWooiGpQ25c4xf3aHOkg==">(), this.lliIiiIIIl.name());
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","e0ZEFIH22byl4aKl+pdW+AAwtS5leO9m4deZfocoqYQ=">(), this.iliIiiIIIl);
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","Et+Axq8IinHxVEEgugYr4Gwq1LYK7NZCTHzpQvTBP4+AIZM=">(), this.IiiIiiIIIl);
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","wEWv9hQDGSRi2nZsUeFN57LZkpZz9RjleWrnJLzuvfsMBNRIq3SbbQ==">(), this.liiIiiIIIl);
      var1.addProperty(IIIllIIliIIl<"IIIllIIliIIl","5r42mfFlVagX2K4QKsfYssr8bXnYBwU5N+8FuNT59uA9EEQFeU0=">(), this.iiiIiiIIIl);
      return var1;
   }

   public static llIIiliilIIili iliIiiliiiii(JsonObject o) {
      llIIiliilIIili var1 = new llIIiliilIIili();

      try {
         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","CgbgKUshNnfL/ASJElTjJgtTZgG/mjaPQ5xtTfvqK2sdx6E=">())) {
            var1.iIiIiiIIIl = o.get(IIIllIIliIIl<"IIIllIIliIIl","CgbgKUshNnfL/ASJElTjJgtTZgG/mjaPQ5xtTfvqK2sdx6E=">()).getAsBoolean();
         }

         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","Bu+ANGO89WLf6UaFwHBc59TzgD2ad6sNLJilHHJRqWQ=">())) {
            var1.IliIiiIIIl = llilIlilililIlil.valueOf(o.get(IIIllIIliIIl<"IIIllIIliIIl","Bu+ANGO89WLf6UaFwHBc59TzgD2ad6sNLJilHHJRqWQ=">()).getAsString());
         }

         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","yNGpX1XcgBNMjxXOLOJeFKM6WGNWooiGpQ25c4xf3aHOkg==">())) {
            var1.lliIiiIIIl = lilIilIiiilIilIi.valueOf(o.get(IIIllIIliIIl<"IIIllIIliIIl","yNGpX1XcgBNMjxXOLOJeFKM6WGNWooiGpQ25c4xf3aHOkg==">()).getAsString());
         }

         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","e0ZEFIH22byl4aKl+pdW+AAwtS5leO9m4deZfocoqYQ=">())) {
            var1.iliIiiIIIl = o.get(IIIllIIliIIl<"IIIllIIliIIl","e0ZEFIH22byl4aKl+pdW+AAwtS5leO9m4deZfocoqYQ=">()).getAsString();
         }

         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","Et+Axq8IinHxVEEgugYr4Gwq1LYK7NZCTHzpQvTBP4+AIZM=">())) {
            var1.IiiIiiIIIl = o.get(IIIllIIliIIl<"IIIllIIliIIl","Et+Axq8IinHxVEEgugYr4Gwq1LYK7NZCTHzpQvTBP4+AIZM=">()).getAsString();
         }

         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","wEWv9hQDGSRi2nZsUeFN57LZkpZz9RjleWrnJLzuvfsMBNRIq3SbbQ==">())) {
            var1.liiIiiIIIl = o.get(IIIllIIliIIl<"IIIllIIliIIl","wEWv9hQDGSRi2nZsUeFN57LZkpZz9RjleWrnJLzuvfsMBNRIq3SbbQ==">()).getAsInt();
         }

         if (o.has(IIIllIIliIIl<"IIIllIIliIIl","5r42mfFlVagX2K4QKsfYssr8bXnYBwU5N+8FuNT59uA9EEQFeU0=">())) {
            var1.iiiIiiIIIl = o.get(IIIllIIliIIl<"IIIllIIliIIl","5r42mfFlVagX2K4QKsfYssr8bXnYBwU5N+8FuNT59uA9EEQFeU0=">()).getAsInt();
         }
      } catch (Exception var3) {
      }

      return var1;
   }
}
