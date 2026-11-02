package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public record lllIllllillIllll(long source, Map<Long, Integer> distances, Map<Long, Long> parents) {
   private final Map<Long, Long> IiiIilIill;
   private final long lliIilIill;
   private final Map<Long, Integer> iliIilIill;

   public Map<Long, Integer> lIiiIiIlilli() {
      return this.iliIilIill;
   }

   public List<Long> liiiIIllIl(long cell) {
      if (!this.iliIilIill.containsKey(cell)) {
         return List.of();
      } else {
         ArrayList var3 = new ArrayList();
         long var4 = cell;

         while (true) {
            var3.add(var4);
            if (var4 == this.lliIilIill) {
               Collections.reverse(var3);
               return List.copyOf(var3);
            }

            var4 = this.IiiIilIill.get(var4);
         }
      }
   }

   public int IliIlllilIi(long cell) {
      return this.iliIilIill.getOrDefault(cell, -1);
   }

   public lllIllllillIllll(long source, Map<Long, Integer> distances, Map<Long, Long> parents) {
      this.lliIilIill = source;
      this.iliIilIill = distances;
      this.IiiIilIill = parents;
   }

   public long IilliliilIIi() {
      return this.lliIilIill;
   }

   public long iIlIlllllill() {
      return this.iliIilIill.keySet().stream().mapToLong(Long::longValue).min().orElse(0L);
   }

   public Map<Long, Long> iliIiiliiiii() {
      return this.IiiIilIill;
   }
}
