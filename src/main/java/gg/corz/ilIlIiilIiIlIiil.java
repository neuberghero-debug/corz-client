package gg.corz;

import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3489;

public enum ilIlIiilIiIlIiil {
   IIIliillil(class_1304.field_6169),
   iIiIiillil(null),
   lliIiillil(null),
   liiIiillil(null),
   IiiIiillil(null),
   IlIliillil(class_1304.field_6166),
   IIiIiillil(null),
   iiiIiillil(null),
   lIIliillil(class_1304.field_6174),
   lIiIiillil(null),
   IliIiillil(null),
   iIIliillil(class_1304.field_6172),
   iliIiillil(null);
   // $VF: synthetic field
   private static final ilIlIiilIiIlIiil[] ilIliillil = IilliliilIIi();
   private final class_1304 llIliillil;

   public boolean liiiIIllIl() {
      return this.llIliillil != null;
   }

   private ilIlIiilIiIlIiil(class_1304 nullx) {
      this.llIliillil = nullx;
   }

   public class_1304 IliIlllilIi() {
      return this.llIliillil;
   }

   public static ilIlIiilIiIlIiil iIlIlllllill(class_1799 s) {
      if (s == null || s.method_7960() || s.method_7914() != 1) {
         return null;
      } else if (s.method_31573(class_3489.field_42611)) {
         return IIiIiillil;
      } else if (s.method_31573(class_3489.field_42612)) {
         return lIiIiillil;
      } else if (s.method_31574(class_1802.field_49814)) {
         return iIiIiillil;
      } else if (s.method_31574(class_1802.field_8547)) {
         return IliIiillil;
      } else if (s.method_31573(class_3489.field_63257)) {
         return lliIiillil;
      } else if (s.method_31573(class_3489.field_42614)) {
         return iliIiillil;
      } else if (s.method_31573(class_3489.field_42615)) {
         return IiiIiillil;
      } else if (s.method_31574(class_1802.field_8102)) {
         return liiIiillil;
      } else if (s.method_31574(class_1802.field_8399)) {
         return iiiIiillil;
      } else if (s.method_31573(class_3489.field_48297)) {
         return IIIliillil;
      } else if (s.method_31573(class_3489.field_48296)) {
         return lIIliillil;
      } else if (s.method_31573(class_3489.field_48295)) {
         return iIIliillil;
      } else {
         return s.method_31573(class_3489.field_48294) ? IlIliillil : null;
      }
   }
}
