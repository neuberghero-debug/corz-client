package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3489;

public enum lIliliiIlili {
   lIIlIllIliIIlIllIl(s -> s.method_31574(class_1802.field_23141), true, true),
   iIiIIllIlIliIIllIl(s -> s.method_31574(class_1802.field_8301), false, true),
   lliIIllIliliIIllIl(s -> s.method_31574(class_1802.field_8281), false, true),
   ilIlIllIlIiIlIllIl(s -> s.method_31573(class_3489.field_42614), false, true),
   IlIlIllIlllIlIllIl(s -> s.method_31574(class_1802.field_8801), true, true),
   IIllIllIllIllIllIl(s -> s.method_31574(class_1802.field_8287), false, false),
   IiiIIllIlliiIIllIl(s -> lIlllIliIlllIl.iIlIlllllill(s), false, true),
   iiiIIllIlIIIlIllIl(s -> s.method_31574(class_1802.field_8634), false, true),
   liIlIllIliiIlIllIl(s -> s.method_31574(class_1802.field_8463) || s.method_31574(class_1802.field_8367), false, false);
   public final Predicate<class_1799> iIllIllIlIlllIllIl;
   public final boolean llllIllIlilllIllIl;
   // $VF: synthetic field
   private static final lIliliiIlili[] iillIllIlIIilIllIl = IIlllIlliIll();
   public final boolean IillIllIllillIllIl;

   private lIliliiIlili(Predicate<class_1799> test, boolean overworldOnly, boolean nullx) {
      this.iIllIllIlIlllIllIl = test;
      this.llllIllIlilllIllIl = overworldOnly;
      this.IillIllIllillIllIl = nullx;
   }
}
