package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public final class IlIiIillIiIi<K> {
   public final LinkedHashMap<K, Integer> IilliIIIllilliIIIl;
   public int IiIiiIIIlliIiiIIIl;
   public final List<K> iilliIIIlIIiliIIIl;
   public int IliliIIIllliliIIIl;
   public int liiliIIIliiiliIIIl;
   public int IIIiiIIIllIIiiIIIl;
   public int llIiiIIIlilIiiIIIl;
   public int ililiIIIlIiiliIIIl;
   public int lIiliIIIliIiliIIIl;
   public final LinkedHashMap<K, Integer> lllliIIIlillliIIIl = new LinkedHashMap<>();
   public boolean iiIiiIIIlIIliiIIIl;
   public int iIIiiIIIlIlIiiIIIl;

   public String IilliliilIIi() {
      return lIiiIiIlilli<"lIiiIiIlilli","g1usvegPIxizEr1sIb6t6eO4PEDzp3lemtWALlrP4yzmArKBXE4=">()
         + this.IilliIIIllilliIIIl.size()
         + lIiiIiIlilli<"lIiiIiIlilli","8wpE7aMFtPqJnIzaZ1v1JdpHoxcF4sMVq4CRrOAtOziYUGo=">()
         + this.IiIiiIIIlliIiiIIIl
         + lIiiIiIlilli<"lIiiIiIlilli","Y5iodFjFOD7UHzm6Cx4TmR6E6KODEjziZzlVuc5qsdVCdzo=">()
         + this.llIiiIIIlilIiiIIIl
         + lIiiIiIlilli<"lIiiIiIlilli","XfJu/ywoZefvFQzB3/U9Z0DB+C1Ch2JiAP3UVp5oVf2YChsg">()
         + this.ililiIIIlIiiliIIIl
         + lIiiIiIlilli<"lIiiIiIlilli","b3duLtWqyCWNViFA+KNR2SiWBcEsLeD0TBo9idk=">()
         + this.liiliIIIliiiliIIIl
         + (
            this.lIiliIIIliIiliIIIl <= this.IliliIIIllliliIIIl
               ? lIiiIiIlilli<"lIiiIiIlilli","L/SYmv+ZUR2L6ozG6rBGLqV1CCVQcgbhYBf63SLL0w==">()
                  + this.lIiliIIIliIiliIIIl
                  + lIiiIiIlilli<"lIiiIiIlilli","XFEnT9ahUBs4VnmU9KaQh5asf8Xq9JgvpMCqRMom">()
                  + this.IliliIIIllliliIIIl
               : ""
         )
         + lIiiIiIlilli<"lIiiIiIlilli","oPNV+srYn/Yi5WH970PiokZC44FWtq2vv76VpTJBZtsPQD8=">()
         + this.IIIiiIIIllIIiiIIIl
         + lIiiIiIlilli<"lIiiIiIlilli","b3duLtWqyCWNViFA+KNR2SiWBcEsLeD0TBo9idk=">()
         + this.iIIiiIIIlIlIiiIIIl
         + (
            this.iilliIIIlIIiliIIIl.isEmpty()
               ? ""
               : lIiiIiIlilli<"lIiiIiIlilli","1nxdeiLNpiy77F9O/76SXo1IcxS2ewGp8E2ERPAgVVGl+ctetw==">() + this.iilliIIIlIIiliIIIl.size()
         )
         + (this.iiIiiIIIlIIliiIIIl ? lIiiIiIlilli<"lIiiIiIlilli","reJ+m9TUcEXNSQgd/oX1qRYrUAb7GNtoqFvT8M6j5Q0HLl5HkUs=">() : "");
   }

   public IlIiIillIiIi() {
      this.IilliIIIllilliIIIl = new LinkedHashMap<>();
      this.iilliIIIlIIiliIIIl = new ArrayList<>();
      this.lIiliIIIliIiliIIIl = Integer.MAX_VALUE;
      this.IliliIIIllliliIIIl = Integer.MIN_VALUE;
   }

   public boolean IliIlllilIi() {
      return this.IilliIIIllilliIIIl.isEmpty();
   }

   public int iIlIlllllill(ToIntFunction<K> maxStack) {
      long var5 = -627504902179137635L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (Entry var4 : this.IilliIIIllilliIIIl.entrySet()) {
         var5 ^= ((long)((int)(var5 >>> 32) + iIIIilIiIlIIilIi.IliIlllilIi((Integer)var4.getValue(), maxStack.applyAsInt(var4.getKey()))) << 32 ^ var5)
            & -1L << 32;
      }

      return (int)(var5 >>> 32);
   }

   public boolean liiiIIllIl() {
      return this.iilliIIIlIIiliIIIl.isEmpty() && this.IIIiiIIIllIIiiIIIl >= this.iIIiiIIIlIlIiiIIIl;
   }
}
