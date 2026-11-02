package gg.corz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_1657;

public class lIiiiiiIiiii extends ilIllIiIll {
   private static final long lIlllIiIliIlllIiIl = 10000L;
   private final Map<UUID, String> IllllIiIllllllIiIl;
   private final Map<UUID, Long> iiIllIiIlIIlllIiIl;
   private final IIiiIIIllIiiIIIl llIllIiIlilIllIiIl = new IIiiIIIllIiiIIIl(
      IliIlllilIi<"IliIlllilIi","jhIuv8zMHx+JKVtnfKxKKNk+qW4ECF45qzElfT+HIhffhks=">(),
      IliIlllilIi<"IliIlllilIi","xsj8NBeONYusGe3XzkeqvvaweDHxfcMDcCuJ3M7EJqgxaFkUWRxDKFaPndd6iEh4KamsYoYS1g==">(),
      IliIlllilIi<"IliIlllilIi","ZyWfuaUxsA2eVWIPdlnUxSra4VXSTu8pjv9vfScezcgpzV32HKkqBX+1OY/ieoRXRB7yZ7YoI9xaMKq3kg==">()
   );
   private final iiIiiilIIliiil IiIllIiIlliIllIiIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","+dceoreoVkYxz2kvt2u0INjvlhNBLLb5dppvG0qp+tpfZ/mMys1v6Dst">(),
      IliIlllilIi<"IliIlllilIi","CRk23ie8YK6YD73qMwB5VXP4NN42B8HIPdWanwOE1f1T01vc68JNdzH33a4J1SySR6d1MfwaCOe2CDOS9FiJva96747NtZV0">(),
      true
   );

   public lIiiiiiIiiii() {
      super(IliIlllilIi<"IliIlllilIi","PnmCCZ8pKrh5ku+YJk8aAUuoxlT2uoK11qaCsrcCU3oEUWlQZh8=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iiIllIiIlIIlllIiIl = new HashMap<>();
      this.IllllIiIllllllIiIl = new HashMap<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIllIiIlilIllIiIl, this.IiIllIiIlliIllIiIl});
   }

   public void lIIlliIIll(class_1657 target) {
      if (this.IliIlllilIi()) {
         this.iiIllIiIlIIlllIiIl.put(target.method_5667(), System.currentTimeMillis());
         this.IllllIiIllllllIiIl.put(target.method_5667(), target.method_5477().getString());
      }
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         long var1 = System.currentTimeMillis();
         this.iiIllIiIlIIlllIiIl.entrySet().removeIf(e -> var1 - e.getValue() > 10000L);
         if (this.IiIllIiIlliIllIiIl.Iilllilliill()) {
            for (UUID var4 : new HashSet<>(this.iiIllIiIlIIlllIiIl.keySet())) {
               boolean var5 = Iiiilllliiilll.field_1687.method_18456().stream().anyMatch(p -> p.method_5667().equals(var4) && p.method_5805());
               if (!var5) {
                  String var6 = this.IlIllllIll(var4);
                  this.iiIllIiIlIIlllIiIl.remove(var4);
                  if (var6 != null) {
                     this.ilIllIiIll(var6);
                  }
               }
            }
         }
      }
   }

   private String IlIllllIll(UUID id) {
      return this.IllllIiIllllllIiIl.remove(id);
   }

   public void iiiIlIIIll(String killedName) {
      if (this.IliIlllilIi()) {
         if (!this.IiIllIiIlliIllIiIl.Iilllilliill()) {
            this.ilIllIiIll(killedName);
         }
      }
   }

   @Override
   public void Iilililiiili() {
      this.iiIllIiIlIIlllIiIl.clear();
   }

   @Override
   public void Illillliilli() {
      this.iiIllIiIlIIlllIiIl.clear();
   }

   private void ilIllIiIll(String playerName) {
      if (Iiiilllliiilll.field_1724 != null) {
         String var2 = this.llIllIiIlilIllIiIl.Iilllilliill();
         Iiiilllliiilll.field_1724
            .field_3944
            .method_45730(
               IliIlllilIi<"IliIlllilIi","W7l+Qq9JIEknhjy98fXmUk6KXqogsQZLlL1bmDR93vs=">()
                  + playerName
                  + IliIlllilIi<"IliIlllilIi","RXlAXwp+Y1VtVvIDpfYJFURSYHS8G+GPz9FDNo8=">()
                  + var2
            );
      }
   }
}
