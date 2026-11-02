package gg.corz;

import net.minecraft.class_2248;
import net.minecraft.class_2281;
import net.minecraft.class_2480;
import net.minecraft.class_2531;
import net.minecraft.class_3708;

public enum IliliIllliliIl {
   liliililliiliilill(iIlIlllllill<"iIlIlllllill","ZvMyMGfER3kj9UJ8tGE+VNmpUMV8O0838t2CmEwKBi/OsoGRzs6T">()),
   Illiilillllliilill(iIlIlllllill<"iIlIlllllill","dg5IvPajmm62QpaZsGuT8hlXb75VT5gJQzuPEoEWe43XivSWKsC66uo=">()),
   illiilillIiliilill(iIlIlllllill<"iIlIlllllill","b6GM5DqujqpPwJ2bjxSDvmtwAMRPlnjNcCFJIxMNbc30Ig==">()),
   lIliililliIliilill(iIlIlllllill<"iIlIlllllill","cyMoKEGENBYAK8StCa5JFBjVzzthi9dFNw32MxWXTp55">());
   public final String IIiiililllIiiilill;

   public static IliliIllliliIl IliIlllilIi(class_2248 block) {
      if (block instanceof class_2531) {
         return Illiilillllliilill;
      } else if (block instanceof class_2281) {
         return lIliililliIliilill;
      } else if (block instanceof class_3708) {
         return illiilillIiliilill;
      } else {
         return block instanceof class_2480 ? liliililliiliilill : null;
      }
   }

   private IliliIllliliIl(String nullx) {
      this.IIiiililllIiiilill = nullx;
   }
}
