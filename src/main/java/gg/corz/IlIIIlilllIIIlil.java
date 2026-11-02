package gg.corz;

import java.util.Locale;

public enum IlIIIlilllIIIlil {
   liiIiilIil,
   IiiIiilIil,
   iliIiilIil;
   // $VF: synthetic field
   private static final IlIIIlilllIIIlil[] iiiIiilIil = liiiIIllIl();

   public static IlIIIlilllIIIlil IliIlllilIi(String setting) {
      long var3 = 6575629930053438273L;
      if (setting == null) {
         return iliIiilIil;
      } else {
         String var1 = setting.trim().toLowerCase(Locale.ROOT);
         var3 ^= (-4294967296L ^ var3) & -1L << 32;
         switch (var1.hashCode()) {
            case -1924829944:
               if (var1.equals(iIlIlllllill<"iIlIlllllill","MPekPO9i0ujoixe90lgvBon2vUFgWCNZyvY1IiLUIs32h1Fb">())) {
                  var3 ^= (0L ^ var3) & -1L << 32;
               }
               break;
            case 553970892:
               if (var1.equals(iIlIlllllill<"iIlIlllllill","+7TeTFjAuKmv00MYhouOmOju/PXdLBWjbK00KeAZq82dfUU=">())) {
                  var3 ^= (4294967296L ^ var3) & -1L << 32;
               }
         }
         return switch ((int)(var3 >>> 32)) {
            case 0 -> IiiIiilIil;
            case 1 -> liiIiilIil;
            default -> iliIiilIil;
         };
      }
   }
}
