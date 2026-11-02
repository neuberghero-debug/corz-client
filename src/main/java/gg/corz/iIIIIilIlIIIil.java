package gg.corz;

import java.util.List;

public final class iIIIIilIlIIIil {
   public static String lIiiIiIlilli(iiIiliiIIlilii toModel, lIIiilIliIIiilIl clip, String to, iiIiliiIIlilii fromModel, lIIiilIliIIiilIl from) {
      long var7 = 7461574534672357675L;
      if (to == null || fromModel == null || from == null) {
         return null;
      } else if (from.iiiililIll.containsKey(to) && fromModel.IlIlllIlilIl(to)) {
         return to;
      } else if (to.startsWith(IIIllIIliIIl<"IIIllIIliIIl","rs+ej9IxDQ2BTQNUsRmT9rbuRYPPz0omtun1I4FWtHA=">())) {
         return liiiIIllIl(fromModel, from);
      } else if (to.startsWith(IIIllIIliIIl<"IIIllIIliIIl","h4RgHBhtCoCz7SDk7g0ixGuOvuhqbqgNHTnEGQYGCFRIJw0=">())) {
         List var5 = iIlIlllllill(fromModel, from);
         if (var5.isEmpty()) {
            return null;
         } else {
            var7 ^= ((long)(toModel != null && clip != null ? Math.max(0, iIlIlllllill(toModel, clip).indexOf(to)) : 0) << 32 ^ var7) & -1L << 32;
            return (String)var5.get((int)(var7 >>> 32) % var5.size());
         }
      } else if (!to.startsWith(IIIllIIliIIl<"IIIllIIliIIl","8QIaXAlpdCdhHi9PPLC+MbWA+LE1OxHCMI1ecHJL16J2Bw==">())) {
         return null;
      } else {
         var7 ^= (
               (long)(
                     to.length() > (((439420091 << 3 | 439420091 >>> 29) >>> 19 | (439420091 << 3 | 439420091 >>> 29) << 13) ^ 79370807)
                           && Character.isDigit(to.charAt(((--1863806464 - -9 ^ 29) << 11 | (--1863806464 - -9 ^ 29) >>> 21) ^ -1150246018))
                        ? to.charAt(-(-2054404453 * -9 >>> 27 | -2054404453 * -9 << 5) ^ 1037004369)
                           - (
                              ((1527121484 << 9 | 1527121484 >>> 23) * -619094385 >>> 11 | (1527121484 << 9 | 1527121484 >>> 23) * -619094385 << 21)
                                 ^ 895409268
                           )
                        : 1
                  )
                  ^ var7
            )
            & -1L >>> 32;
         return IilliliilIIi(fromModel, from, (int)var7 == ((~(1658910695 ^ -11) << 1 | ~(1658910695 ^ -11) >>> 31) ^ -977145895), (int)var7 - 1);
      }
   }

   public static String liiiIIllIl(iiIiliiIIlilii knife, lIIiilIliIIiilIl model) {
      String var2 = knife.IIIllIIliIIl();
      return model.iiiililIll.containsKey(var2) ? var2 : IIIllIIliIIl<"IIIllIIliIIl","rs+ej9IxDQ2BTQNUsRmT9rbuRYPPz0omtun1I4FWtHA=">();
   }

   public static String IliIlllilIi(iiIiliiIIlilii knife, lIIiilIliIIiilIl model) {
      String var2 = knife.iliIiiliiiii();
      return model.iiiililIll.containsKey(var2) ? var2 : IIIllIIliIIl<"IIIllIIliIIl","TDoL5AFsENNqgAYBk/QBJGQR2RPPadAKhp4qyfXvZor6NZd+6e2x">();
   }

   private iIIIIilIlIIIil() {
   }

   public static String IilliliilIIi(iiIiliiIIlilii model, lIIiilIliIIiilIl heavy, boolean knife, int sequence) {
      String var4 = knife
         ? IIIllIIliIIl<"IIIllIIliIIl","ZinI1/rgOsdRg4Ezh6ASxNchngrhwDwjN7uulcyse4ksJmI=">()
         : IIIllIIliIIl<"IIIllIIliIIl","8QIaXAlpdCdhHi9PPLC+MbWA+LE1OxHCMI1ecHJL16J2Bw==">() + (1 + Math.floorMod(sequence, 2));
      if (!heavy.iiiililIll.containsKey(var4)) {
         var4 = IIIllIIliIIl<"IIIllIIliIIl","hCyrqrO5Nk9FMu+IcDD+V2vz3jkRi+V+2XfjgI7c7tl7rBQ=">();
      }

      if (model.iIlIlllllill() && heavy.iiiililIll.containsKey(var4 + IIIllIIliIIl<"IIIllIIliIIl","wBtXve8GyZCGlJevNLNfz2JHj1VGguj0t7U0SEkBGjd74A==">())) {
         var4 = var4 + IIIllIIliIIl<"IIIllIIliIIl","wBtXve8GyZCGlJevNLNfz2JHj1VGguj0t7U0SEkBGjd74A==">();
      }

      return var4;
   }

   public static List<String> iIlIlllllill(iiIiliiIIlilii model, lIIiilIliIIiilIl knife) {
      return knife.iiiililIll
         .keySet()
         .stream()
         .filter(knifex -> knifex.startsWith(IIIllIIliIIl<"IIIllIIliIIl","h4RgHBhtCoCz7SDk7g0ixGuOvuhqbqgNHTnEGQYGCFRIJw0=">()) && model.IlIlllIlilIl(knifex))
         .toList();
   }
}
