package net.ess3.settings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import net.ess3.storage.ListType;
import net.ess3.storage.StorageObject;
import org.bukkit.inventory.ItemStack;


@Data
@EqualsAndHashCode(callSuper = false)
public class Kit implements StorageObject
{
	@ListType(ItemStack.class)
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private List<ItemStack> items;
	private Double delay;

	public List<ItemStack> getItems()
	{
		return items == null
			   ? Collections.<ItemStack>emptyList()
			   : Collections.unmodifiableList(items);
	}
	
	public void setItems(Collection<ItemStack> items) {
		this.items = new ArrayList<ItemStack>(items);
	}
}
