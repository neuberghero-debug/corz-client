package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class IliiiIlllliiiIll {
   public static final int iiiiliilll = 10;

   private IliiiIlllliiiIll() {
   }

   public static IliIiiilliIiii IliIlllilIi(List<lliiliiiliilii> remaining) {
      long var9 = 3727026634747591702L;
      LinkedHashMap var1 = new LinkedHashMap();

      for (lliiliiiliilii var3 : remaining) {
         var1.put(var3.IliIlllilIi(), var3);
      }

      LinkedHashMap var11 = new LinkedHashMap();

      for (lliiliiiliilii var4 : remaining) {
         var9 ^= (0L ^ var9) & -1L << 32;

         for (long var7 : var4.iIlIlllllill()) {
            if (var1.containsKey(var7) && var7 != var4.IliIlllilIi()) {
               var9 += 4294967296L;
            }
         }

         var11.put(var4.IliIlllilIi(), (int)(var9 >>> 32));
      }

      ArrayList var13 = new ArrayList();
      var9 ^= (1L ^ var9) & -1L >>> 32;

      while ((int)var9 != 0) {
         var9 ^= (0L ^ var9) & -1L >>> 32;

         for (lliiliiiliilii var15 : remaining) {
            if (var11.containsKey(var15.IliIlllilIi()) && (Integer)var11.get(var15.IliIlllilIi()) == 0) {
               var13.add(var15);
               var11.remove(var15.IliIlllilIi());

               for (lliiliiiliilii var8 : remaining) {
                  if (var11.containsKey(var8.IliIlllilIi()) && var8.iIlIlllllill().contains(var15.IliIlllilIi())) {
                     var11.merge(var8.IliIlllilIi(), -1, Integer::sum);
                  }
               }

               var9 ^= (1L ^ var9) & -1L >>> 32;
            }
         }
      }

      ArrayList var14 = new ArrayList();

      for (lliiliiiliilii var18 : remaining) {
         if (var11.containsKey(var18.IliIlllilIi())) {
            var14.add(var18);
         }
      }

      return new IliIiiilliIiii(List.copyOf(var13), List.copyOf(var14));
   }
}
