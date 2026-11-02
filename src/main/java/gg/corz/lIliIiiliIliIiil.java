package gg.corz;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

public final class lIliIiiliIliIiil {
   public static List<IIIllIllIIllIl> IliIlllilIi(liiIiiiiiIii reason) {
      ArrayList var1 = new ArrayList();
      var1.add(IIIllIllIIllIl.IiilllIllliilllIll);
      var1.add(IIIllIllIIllIl.iiilllIllIIIillIll);
      var1.add(IIIllIllIIllIl.lIIillIlliIIillIll);
      if (reason == liiIiiiiiIii.IIIIlilIllIIIlilIl) {
         var1.add(IIIllIllIIllIl.IlIillIllllIillIll);
      }

      var1.add(IIIllIllIIllIl.ilIillIllIiIillIll);
      return var1;
   }

   public static boolean IilliliilIIi(liiIiiiiiIii reason, Set<IIIllIllIIllIl> rejected) {
      return rejected != null && rejected.containsAll(IliIlllilIi(reason));
   }

   public static Set<IIIllIllIIllIl> IIIllIIliIIl() {
      return EnumSet.noneOf(IIIllIllIIllIl.class);
   }

   public static String iliIiiliiiii(liIIlIIliiIIlIIl firstAction, Set<IIIllIllIIllIl> req, IIIllIllIIllIl result, String selected, IilIlIllilIlIl tried) {
      return String.format(
         Locale.ROOT,
         IlIlllIlilIl<"IlIlllIlilIl","azgtDwM+nV4KKVfqmiw9/l9arfzciaulVlB6cDPPmMXzddA01E2x3jB2SlwIkFpr7OgAI9NyWUx+E0cGXZL03Q5c8YJH8cvqi/dzWJ8pjZcDqDoVO7V0TNE8aJ/3F5s1iaotBWs5loTtLw1BklI0GT6UCBM4/VZmYNcDWXMRWjqIcFNRe/ps3jEYnqI=">(),
         firstAction.IilliliilIIi(),
         firstAction.lIiiIiIlilli().size(),
         firstAction.liiiIIllIl().iliIiiliiiii(),
         firstAction.iliIiiliiiii(),
         IliIlllilIi(firstAction.IilliliilIIi()),
         result == null ? IlIlllIlilIl<"IlIlllIlilIl","GI+DGS7bvYLyEkvpSoossQVMSJYxxn7nG1Hbik9yKTM=">() : result,
         selected == null ? IlIlllIlilIl<"IlIlllIlilIl","GI+DGS7bvYLyEkvpSoossQVMSJYxxn7nG1Hbik9yKTM=">() : selected,
         tried
      );
   }

   public static boolean liiiIIllIl(liIIlIIliiIIlIIl req, long stand) {
      return !req.IIIllIIliIIl().contains(stand);
   }

   private lIliIiiliIliIiil() {
   }

   public static IilIlIllilIlIl lIiiIiIlilli(liiIiiiiiIii reason, Set<IIIllIllIIllIl> rejected, boolean solved) {
      if (solved) {
         return IilIlIllilIlIl.lIllIIIlliIllIIIll;
      } else {
         return IilliliilIIi(reason, rejected) ? IilIlIllilIlIl.illlIIIllIillIIIll : IilIlIllilIlIl.IlllIIIllllllIIIll;
      }
   }

   public static Optional<IIIllIllIIllIl> iIlIlllllill(liiIiiiiiIii tried, Set<IIIllIllIIllIl> reason) {
      for (IIIllIllIIllIl var3 : IliIlllilIi(tried)) {
         if (reason == null || !reason.contains(var3)) {
            return Optional.of(var3);
         }
      }

      return Optional.empty();
   }
}
